package com.jm2008.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	public MyRequestAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute has been removed." + srae.getName()+" "+srae.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute has been added." + srae.getName()+" "+srae.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("Request Attribute has been replaced." + srae.getName()+" "+srae.getValue());
	}

}
