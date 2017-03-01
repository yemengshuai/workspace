package com.example.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener {
	private String breed;
	
	public Dog(String breed){
		this.breed=breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void valueBound(HttpSessionBindingEvent event){
		
	}
	
	public void valueUnBound(HttpSessionBindingEvent event){
		
	}
}
