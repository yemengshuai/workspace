package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionAttribute extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("foo", "42");
		session.setAttribute("bar", "420");
		session.setMaxInactiveInterval(0);
		String foo = (String) session.getAttribute("foo");
		
		if (session.isNew()) {
			out.println("This is a new session");
		}else {
			out.println("Welcome back");
		}
		out.println("Foo="+foo);
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	
	throws IOException,ServletException{
		doGet(request, response);
	}
}
