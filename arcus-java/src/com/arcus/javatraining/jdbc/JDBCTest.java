package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement;
		try {

			// Step 1: Loading and registering drivers

			// Loading driver using forName() method
			//	Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Create the connection object

			// url syntax for mysql - protocol//[hosts][/database][?properties]
			// jdbc:mysql://mysql.db.server:3306/my_database

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");

			// Step 3: Create a statement

			// 3 types of statements - Statement, PreparedStatement,  Callable Statement

			statement = connection.createStatement();
			String sql = "select * from empdetails";

			
			/*
			 * String tableSql = "CREATE TABLE IF NOT EXISTS emptab" +
			 * "(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30)," +
			 * "position varchar(30), salary double)"; statement.execute(tableSql);
			 * 
			 */
			// Step 4: Execute the query
			// 2 different execute methods - executeQuery(), executeUpdate()

			// ResultSet result= statement.executeQuery("select * from empdetails");
			ResultSet result = statement.executeQuery(sql);

			// Step 5: Process the results

			// Condition check using hasNext() method which
			// holds true till there is single element
			// remaining in List
			while (result.next()) {

				// Print name an age
				System.out.println("ID: " + result.getString("empid"));
				System.out.println("Name: " + result.getString("empname"));
				System.out.println("Age:" + result.getString("empage"));
				System.out.println();
			}
		}

		// Catching database exceptions if any
		catch (SQLException e) {

			// Print the exception
			System.out.println(e);
		}

		// Catching generic ClassNotFoundException if any
		/*
		 * catch (ClassNotFoundException e) {
		 * 
		 * // Print and display the line number // where exception occurred
		 * e.printStackTrace(); }
		 */

		finally {

			if (connection != null) {
				connection.close();
			}
		}
	}

}
