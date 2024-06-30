package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumServlet
 */
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1 and no2");
		int no1 = sc.nextInt();
		out.print("<h2>No1 = "+no1+"</h2>");
		int no2 = sc.nextInt();
		out.print("<h2>No2 = "+no2+"</h2>");
		
		int sum = no1 + no2;
		out.print("<h2>ANS = "+sum+"</h2>");
		
		
		
		
	}

}
