package com.arcus.javatraining.jdbc;

// Import required packages
import java.sql.*;

public class JDBCBatch {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/employee";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "password";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Create SQL statement
			String SQL = "INSERT INTO EMPDETAILS (EMPID, EMPNAME, EMPAGE) VALUES (?,?,?)";

			// Create preparedStatemen
			System.out.println("Creating statement...");
			stmt = conn.prepareStatement(SQL);

			// Set auto-commit to false
			conn.setAutoCommit(false);

			// First, let us select all the records and display them.
			printRows(stmt);

			// Set the variables
			stmt.setInt(1, 20);
			stmt.setString(2, "Ankit");
			stmt.setInt(3, 33);
			// Add it to the batch
			stmt.addBatch();

			// Set the variables
			stmt.setInt(1, 30);
			stmt.setString(2, "stewart");
			stmt.setInt(3, 43);
			// Add it to the batch
			stmt.addBatch();

			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
			conn.commit();

			// Again, let us select all the records and display them.
			printRows(stmt);

			// Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

	public static void printRows(Statement stmt) throws SQLException {
		System.out.println("Displaying available rows...");
		// Let us select all the records and display them.
		String sql = "SELECT EMPID, EMPNAME, EMPAGE FROM EMPDETAILS";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("EMPID");
			int age = rs.getInt("EMPAGE");
			String name = rs.getString("EMPNAME");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Age: " + age);
			System.out.print(", Name: " + name);
			System.out.println();

		}
		System.out.println();
		rs.close();
	}// end printRows()
}// end JDBCExample