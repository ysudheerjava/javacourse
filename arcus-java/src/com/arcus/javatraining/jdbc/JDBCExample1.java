package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "password");

		Statement stmt = con.createStatement();// Step 3: Create statement object
		ResultSet rs = stmt.executeQuery("select * from employee");// Step4: Create a ResultSet object

		int empid = 0;

		while (rs.next()) {

			empid = rs.getInt(1); //

			String lastname = rs.getString("lastname");
			// String email = rs.getString(2);
			String firstname = rs.getString(3);
			

			System.out.print("empid: " + empid);
			System.out.print(", LastName: " + lastname);
			System.out.print("FistName: " + firstname);
			System.out.println();
		
		}
	
	}
}
