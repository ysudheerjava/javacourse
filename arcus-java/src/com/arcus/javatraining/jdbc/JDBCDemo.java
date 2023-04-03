package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo {

	private String jdbcURL = "jdbc:mysql://localhost:3306/employee";
	private String jdbcUsername = "root";
	private String jdbcPassword = "password";

	private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO empdetails" + "  (empid, empname,empage) VALUES "
			+ " (?, ?, ?);";
	private static final String SELECT_ALL_EMPLOYEES = "select * from candidate";
	private static final String DELETE_EMPLOYEE_SQL = "delete from candidate where id = ?;";
	private static final String UPDATE_EMPLOYEE_SQL = "update candidate set name = ?,gender=?,email= ?, qualification=?,state =? where id = ?;";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void insertEmployee(String insertQuery) {

		System.out.println(insertQuery);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(insertQuery)) {
			ps.setInt(1, 300);
			ps.setString(2, "ram");
			ps.setInt(3, 34);
			;
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	

	
	


	public void listEmployees() {
	}

	public static void main(String[] args) {

		JDBCDemo jd = new JDBCDemo();
		jd.insertEmployee(INSERT_EMPLOYEE_SQL);

	}

}
