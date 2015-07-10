package com.whale.eos.basic.util.security.shiro.cache;

import net.rubyeye.xmemcached.MemcachedClient;

import org.apache.shiro.ShiroException;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**  
 *   
 * 缓存管理器实现类  
 *   
 * @author 李建东  
 *   
 */  
public class MemcachedManagerImpl implements MemcachedManager {  
	
	private static final Logger log = LoggerFactory.getLogger(MemcachedManagerImpl.class);
  
    private MemcachedClient memcachedClient;  
    
    public MemcachedClient getMemcachedClient() {
		return memcachedClient;
	}

	public void setMemcachedClient(MemcachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	public MemcachedManagerImpl(MemcachedClient memcachedClient) {  
        if (memcachedClient == null) {  
            throw new RuntimeException("必须存在memcached客户端实例");  
        }
        if (log.isDebugEnabled()) {
            log.debug("init MemcachedClient 实例... ");
        }
        this.memcachedClient = memcachedClient;  
    }  
  
    @Override  
    public void createCache(String name, Cache<Object, Object> cache) throws CacheException {  
        try {  
            memcachedClient.set(name, 0, cache);  
        } catch (Exception e) {  
            throw new CacheException(e);  
        }  
    }  
  
    @Override  
    public Cache<Object, Object> getCache(String name) throws CacheException {  
        try {  
            return memcachedClient.get(name);  
        } catch (Exception e) {  
            throw new CacheException(e);  
        }  
    }  
  
    @Override  
    public void removeCache(String name) throws CacheException {  
        try {  
            memcachedClient.delete(name);  
        } catch (Exception e) {  
            throw new CacheException(e);  
        }  
    }  
  
    @Override  
    public void updateCahce(String name, Cache<Object, Object> cache) throws CacheException {  
        try {  
            memcachedClient.replace(name, 0, cache);  
        } catch (Exception e) {  
            throw new CacheException(e);  
        }  
    }  
  
    @Override  
    public void destroy() throws CacheException {  
        try {
        	if (log.isDebugEnabled()) {
                log.debug("shutdown MemcachedClient 实例... ");
            }
            memcachedClient.shutdown();  
        } catch (Exception e) {  
            throw new CacheException(e);  
        }  
    }

	@Override
	public void init() throws ShiroException {
		ensureCacheManager();
    }

    private MemcachedClient ensureCacheManager() {
        try {
            if (this.memcachedClient == null) {
                if (log.isDebugEnabled()) {
                    log.debug("cacheManager property not set.  Constructing CacheManager instance... ");
                }
                throw new RuntimeException("必须存在memcached客户端实例"); 
            }
            return this.memcachedClient;
        } catch (Exception e) {
            throw new CacheException(e);
        }
    }
  
}