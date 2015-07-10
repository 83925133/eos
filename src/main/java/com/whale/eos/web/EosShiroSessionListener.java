package com.whale.eos.web;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EosShiroSessionListener implements SessionListener {

	private static Logger LOG = LoggerFactory.getLogger(EosShiroSessionListener.class);
	@Override
	public void onStart(Session session) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("onStart");
		}
	}

	@Override
	public void onStop(Session session) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("onStop");
		}	
	}

	@Override
	public void onExpiration(Session session) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("session失效");
		}
	}
}
