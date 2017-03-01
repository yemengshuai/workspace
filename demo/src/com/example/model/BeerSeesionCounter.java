package com.example.model;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class BeerSeesionCounter implements HttpSessionListener {
		static private int activeSessions;
		public static int getActiveSession(){
			return activeSessions;
		}
		
		public void sessionCreated(HttpSessionEvent event) {
			activeSessions++;
		}
		public void sessionDestroyed(HttpSessionEvent event) {
			activeSessions--;
		}
}
