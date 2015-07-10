package com.whale.eos.basic.util.security.shiro.session;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

import net.rubyeye.xmemcached.MemcachedClient;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemcachedSessionDAO extends AbstractSessionDAO {  
	  
    private final static Logger log = LoggerFactory.getLogger(MemcachedSessionDAO.class);  
  
    private MemcachedClient memcachedClient;  
  
    public MemcachedClient getMemcachedClient() {
		return memcachedClient;
	}

	public void setMemcachedClient(MemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	public MemcachedSessionDAO(MemcachedClient memcachedClient) {  
        if (memcachedClient == null) {  
            throw new RuntimeException("必须存在memcached客户端实例");  
        }  
        this.memcachedClient = memcachedClient;  
    }  
  
    @Override  
    protected Serializable doCreate(Session session) {  
        Serializable sessionId = generateSessionId(session);  
        assignSessionId(session, sessionId);  
        try {  
            memcachedClient.set(sessionId.toString(), (int) session.getTimeout() / 1000, session);  
        } catch (Exception e) {  
            log.error(e.getMessage());  
        }  
        return sessionId;  
    }  
  
    @Override  
    protected Session doReadSession(Serializable sessionId) {  
        Session session = null;  
        try {  
            session = memcachedClient.get(sessionId.toString());  
        } catch (Exception e) {  
            log.error(e.getMessage());  
        }  
        return session;  
    }  
  
    @Override  
    public void delete(Session session) {  
        try {  
            memcachedClient.delete(session.getId().toString());  
        } catch (Exception e) {  
            log.error(e.getMessage());  
        }  
    }  
  
    @Override  
    public Collection<Session> getActiveSessions() {  
        return Collections.emptySet();  
    }  
  
    @Override  
    public void update(Session session) throws UnknownSessionException {  
        try {  
            memcachedClient.replace(session.getId().toString(), (int) session.getTimeout() / 1000, session);  
        } catch (Exception e) {  
            log.error(e.getMessage());  
        }  
    }  
  
}  
