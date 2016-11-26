package com.learn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestServletContextListner implements ServletContextListener {
	
	public TestServletContextListner() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("##########   This Context is Initialized");
	}

	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("This Context is Initialized");
	}
}
