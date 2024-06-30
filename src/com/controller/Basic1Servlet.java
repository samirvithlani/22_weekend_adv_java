package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Basic1Servlet
 */
public class Basic1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("serveltt called...");

		String name = request.getParameter("txtName");
		System.out.println("Name = " + name);

		String gender = request.getParameter("gender");
		System.out.println("Gender = " + gender);

		String strAge = request.getParameter("txtAge");
		
		String skills[] = request.getParameterValues("skills");
		if(skills!=null) {
			for(String s:skills) {
				System.out.println(s);
			}	
		}
		
		int age = 0;
		if (!strAge.trim().equals("")) {
			age = Integer.parseInt(strAge);
		}
		// int age = Integer.parseInt(request.getParameter("txtAge")); // "12" ""

		System.out.println("age = " + age);
	}

}
