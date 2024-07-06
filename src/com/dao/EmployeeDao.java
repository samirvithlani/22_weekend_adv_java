package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.EmployeeBean;
import com.util.DBConnection;

public class EmployeeDao {

	public int addEmployee(EmployeeBean employeeBean) {
		
		int res =0;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String insertSQL = "insert into employee(name,email,age)values(?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);

				pstmt.setString(1, employeeBean.getName());
				pstmt.setString(2, employeeBean.getEmail());
				pstmt.setInt(3, employeeBean.getAge());
				
				res = pstmt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return res;

	}

}
