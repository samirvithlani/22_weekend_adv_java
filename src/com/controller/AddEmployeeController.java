package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;
import com.dao.EmployeeDao;

/**
 * Servlet implementation class AddEmployeeController
 */
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		
		EmployeeBean employeeBean = new EmployeeBean();
		
		employeeBean.setName(name);
		employeeBean.setEmail(email);
		employeeBean.setAge(age);
		
		EmployeeDao employeeDao = new EmployeeDao();
		int res = employeeDao.addEmployee(employeeBean);
		if(res>0) {
			System.out.println("record inserted...");
		}
		else {
			
			System.out.println("not inserted..");
		}
	}

}
