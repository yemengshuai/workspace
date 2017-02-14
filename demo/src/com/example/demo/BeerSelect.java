package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet{

	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException
	{
		
		
		/*response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Beer Selection Advice<br>");*/
		String c=request.getParameter("color");
		
		BeerExpert be= new BeerExpert();
		List result = be.getBrands(c);
		
		/*Iterator it= result.iterator();
		
		
		while(it.hasNext()){
			out.println( "<br> try:"+it.next());
		}*/
		
		request.setAttribute("styles", result);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		view.forward(request, response);
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException
	{
		doPost(request, response);
	}
}
