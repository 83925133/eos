package com.whale.eos.basic.util.security.shiro.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.util.Destroyable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.whale.eos.basic.util.StringUtil;
import com.whale.eos.basic.util.spring.PropertyUtil;

/**  
 *   
 * 安全框架缓存管理器实现类  
 *   
 * @author 李建东
 *   
 */  
public class ShiroCacheManager implements CacheManager, Destroyable {  
  
	private static final Logger log = LoggerFactory.getLogger(ShiroCacheManager.class);
	
    private MemcachedManager memcachedManager;  
    
    private EhCacheManager ehCacheManager; 
    
    private static final String MEMCACHED = "memcached";
    
    private static final String CACHE_KEY = "cache";
    
    private static final String EHCACHE = "ehcache";
    
    private static String CACHE_NAME;
    
    static{
    	CACHE_NAME = PropertyUtil.getString(CACHE_KEY);
    }

	@Override  
    public Cache<Object, Object> getCache(String name) throws CacheException {
		if (StringUtil.equals(CACHE_NAME, MEMCACHED)) {
			if (log.isDebugEnabled()) {
                log.debug("getCache from memcached ... ");
            }
			return memcachedManager.getCache(name);  
		}else if (StringUtil.equals(CACHE_NAME, EHCACHE)){
			if (log.isDebugEnabled()) {
                log.debug("getCache from ehcache ... ");
            }
			return ehCacheManager.getCache(name);
		}else {
			if (log.isDebugEnabled()) {
                log.debug("getCache from ehcache ... ");
            }
			return ehCacheManager.getCache(name);
		}
    }  
  
    @Override  
    public void destroy() throws Exception {
    	if (StringUtil.equals(CACHE_NAME, MEMCACHED)) {
    		if (log.isDebugEnabled()) {
                log.debug("destroyCache memcached ... ");
            }
    		memcachedManager.destroy();  
		}else if (StringUtil.equals(CACHE_NAME, EHCACHE)){
			if (log.isDebugEnabled()) {
                log.debug("destroyCache ehcache ... ");
            }
			ehCacheManager.destroy();  
		}else {
			if (log.isDebugEnabled()) {
                log.debug("destroyCache ehcache ... ");
            }
			ehCacheManager.destroy();  
		}
    }  
  
    public MemcachedManager getMemcachedManager() {  
        return memcachedManager;
    }  
  
    public void setMemcachedManager(MemcachedManager memcachedManager) {  
        this.memcachedManager = memcachedManager;  
    }  
    
    public EhCacheManager getEhCacheManager() {
		return ehCacheManager;
	}

	public void setEhCacheManager(EhCacheManager ehCacheManager) {
		this.ehCacheManager = ehCacheManager;
	}
} 
