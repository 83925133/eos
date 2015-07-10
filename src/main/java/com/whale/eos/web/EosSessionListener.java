package com.whale.eos.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class EosSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		EosSessionContext.removeSession(event.getSession());
		System.out.println("移除了Session:"+event.getSession().getId());
	}

}
