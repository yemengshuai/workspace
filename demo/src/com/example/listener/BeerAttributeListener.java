package com.example.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class BeerAttributeListener implements HttpSessionActivationListener {
	
	
	public void attributeAdded(HttpSessionBindingEvent event){
		
		
		String name = event.getName();
		Object value = event.getValue();
		
		System.out.println("Attribute added:" +name+":"+value);
	}
	
	
	public void  attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		
		System.out.println("Attribute removed:" +name+":"+value);
	}
	
	public void  attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		
		System.out.println("Attribute replaced:" +name+":"+value);
	}
}
