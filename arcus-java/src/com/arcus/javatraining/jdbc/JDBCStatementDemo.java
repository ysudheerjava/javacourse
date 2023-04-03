package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCStatementDemo {

	static final String driverName = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/EMPDB";
	static final String username = "root";
	static final String password = "password";

	static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET designation='Project Manager'";

	static final String SELECT_QUERY = "SELECT EMPID,lastname,designation FROM EMPLOYEE";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName(driverName);
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = DriverManager.getConnection(url, username, password);
		
	
		Statement st = con.createStatement();	
		
		
		//Using execute() Method
		boolean result = st.execute(UPDATE_QUERY);
		System.out.println(result); //false

		boolean result1 = st.execute(SELECT_QUERY);
		System.out.println(result1);
		
		//Using executeUpdate() method

		int i = st.executeUpdate(UPDATE_QUERY);
		System.out.println("Return value of executeUpdate()");
		System.out.println(i);

		ResultSet rs = st.executeQuery(SELECT_QUERY);

		while (rs.next()) {

			int id = rs.getInt("EMPID");
			String designation = rs.getString("Designation");
			String lastName = rs.getString("lastName");
			
			System.out.println("ID: " + id + "|" + "Name: " + lastName+"|" + "Designation: " + designation);

		}

	}

}
