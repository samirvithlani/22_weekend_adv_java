package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleDemoServlet
 */
public class LifeCycleDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	int i=0;
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("init method called....");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("service method called...");
		i++;
		PrintWriter out = response.getWriter();
		out.print("<h1>"+i+"</h1>");
		out.print("<script>alert('ok')</script>");
	}
	@Override
	public void destroy() {
		
		System.out.println("server close...");
	}

}
