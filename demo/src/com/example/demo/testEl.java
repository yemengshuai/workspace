package com.example.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testEl extends HttpServlet {
	
	public void doPsot(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	
	{
		String name = request.getParameter("username");
		request.setAttribute("name", name);
		
		RequestDispatcher view =request.getRequestDispatcher("/result.jsp");
		view.forward(request, response);
	}

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{
		
	}
}
