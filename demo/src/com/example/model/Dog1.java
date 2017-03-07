package com.example.model;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Dog1 implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {

	
	
	private String breed;
	
	public void valueBound(HttpSessionBindingEvent event){
		
	}
	
	public void  valueUnbound(HttpSessionBindingEvent event) {
		
	}
	
	public void sessionWillPassivate(HttpSessionEvent event){
		
	}
	
	public void sessionDidActivite(HttpSessionEvent event){
		
	}
}
