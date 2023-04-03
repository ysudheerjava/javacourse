package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecuteExample {
	public static void main(String args[]) throws SQLException {
		// Registering the Driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost/arcus";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
		System.out.println("Connection established......");
		// Creating the Statement
		Statement stmt = con.createStatement();

		// Executing the statement
		String createTable = "CREATE TABLE ArcusEmployee( " + "Name VARCHAR(255), " + "Salary INT NOT NULL, "
				+ "Location VARCHAR(255))";
		boolean bool = stmt.execute(createTable);

		System.out.println(bool);
	}
}