package com.arcus.javatraining.jdbc.txn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.cj.jdbc.Driver"); // Step1 : Register the driver

		Connection connection = null;
		Statement statement1 = null;
		try {

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb", "root", "password");
			connection.setAutoCommit(false);

			statement1 = connection.createStatement();
			statement1.executeUpdate("update employee set firstname='Roshan',lastname='John' where empid=102");

			ResultSet rs = statement1.executeQuery("select empid,firstname, lastname from employee where empid=102");

			while (rs.next()) {
				int id = rs.getInt("EMPID");
				String firstname = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				System.out.println("ID: " + id + "|" + "First Name: " + firstname + "|" + "Last Name: " + lastName);
			}

			connection.commit();
		} finally {
			if (statement1 != null) {
				statement1.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}

}
