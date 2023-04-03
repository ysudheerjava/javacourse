package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException {

		try {

		//Class.forName("com.mysql.cj.jdbc.Driver"); // Step1 : Register the driver
		
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/arcus", "root", "password");// Step
																													// 2:																												// Get																										// Connection
			Statement stmt = con.createStatement();
			
			// Step 3: Create statement object
			
			
			//stmt.executeUpdate(null)
			ResultSet rs = stmt.executeQuery("select * from candidate");// Step4: Create a ResultSet object

			int id = 0;

			while (rs.next()) {

				id = rs.getInt(1); //

				String email = rs.getString("email");
				// String email = rs.getString(2);
				String gender = rs.getString(3);
				String name = rs.getString(4);
				String qualification = rs.getString(5);
				String state = rs.getString(6);

				System.out.print("ID: " + id);
				System.out.print(", Email: " + email);
				System.out.print("Name: " + name);
				System.out.print(", Qualification: " + qualification);
				System.out.print(", State: " + state);
				System.out.println();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
