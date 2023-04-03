package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*Program to demonstrate CRUD operations using JDBC*/
public class JDBCCRUDDemo {

	
	/* queries to perform CRUD operations */
	private static final String INSERT_SQL = "INSERT INTO EMPDETAILS (EMPID, EMPNAME, EMPAGE) VALUES (?,?,?)";
	private static final String UPDATE_SQL = "UPDATE EMPDETAILS SET EMPNAME=?, EMPAGE=? WHERE EMPID=?";
	private static final String DELETE_SQL = "DELETE FROM EMPDETAILS WHERE EMPID=?";

	
	//to get connection to database
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");
		return connection;
	}
	
	
	
	
	//to update an employee
	public static void updateEmployee() {
		try (Connection connection = getConnection(); 
				PreparedStatement ps = connection.prepareStatement(UPDATE_SQL)) {
				ps.setString(1, "Don");
				ps.setInt(2, 33);
				ps.setInt(3, 300);
				System.out.println(ps);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		
		
	}

	//to insert a record into Employee table
	public static void insertEmployee() {

		try (Connection connection = getConnection(); 
			PreparedStatement ps = connection.prepareStatement(INSERT_SQL)) {
			ps.setInt(1, 400);
			ps.setString(2, "Rakesh");
			ps.setInt(3, 43);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	}
		
	//to delete a record into Employee table
	public static void deleteEmployee() {
		try (Connection connection = getConnection(); 
			PreparedStatement ps = connection.prepareStatement(DELETE_SQL)) {
			ps.setInt(1, 400);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	}

	public static void main(String args[]) {
		
	//	insertEmployee();
		//updateEmployee();
		deleteEmployee();
	}

}
