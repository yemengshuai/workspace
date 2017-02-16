package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class falseSession extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws
	IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test session<br>");
		
		HttpSession session =request.getSession(false);
		if (session == null) {
			out.println("no session was available");
			
			out.println("making one ...");
			
			session = request.getSession();
			
		}else {
			out.println("there was a session");
		}
	}

}
