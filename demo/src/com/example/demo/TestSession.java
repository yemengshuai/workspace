package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class TestSession extends HttpServlet {

	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("test session attributes<br>");
		HttpSession session = request.getSession();
		if (session.isNew()) {
			out.println("This is a new session");
		}else {
			out.println("Welcome back");
		}
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException
	{
		doGet(request, response);
	}
	
}
