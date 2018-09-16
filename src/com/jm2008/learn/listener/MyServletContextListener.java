package com.jm2008.learn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

	public MyServletContextListener() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext is destroyed.");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext is initialized.");
		System.out.println("I'm creating tables.");
	}

}
