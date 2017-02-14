package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet{

	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Beer Selection Advice<br>");
		String c=request.getParameter("color");
		out.println("<br>Got beer color:"+c);
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException
	{
		doPost(request, response);
	}
}
