package com.arcus.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCRUDOperations {

	private static final String createQuery = "CREATE TABLE ARCUSSTUDENT(id INTEGER not NULL,firstname VARCHAR(255),lastname VARCHAR(255),age INTEGER, PRIMARY KEY ( id ))";

	private static final String insertQuery = "INSERT INTO ARCUSSTUDENT (id, firstname,lastname, age) values (?,?,?,?)";

	private static final String selectQuery = "SELECT * FROM ARCUSSTUDENT";

	private static final String updateQuery = "Update ARCUSSTUDENT SET FIRSTNAME =?, LASTNAME =?, AGE =? WHERE ID= ?";

	private static final String deleteQuery = "DELETE FROM ARCUSSTUDENT WHERE ID=?";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arcus", "root", "password");
		return con;
	}

	public static void createTable() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		stmt.executeUpdate(createQuery);
		System.out.println("Table Created successfully!");

	}

	public static void insertData() throws ClassNotFoundException, SQLException {

		Connection con = getConnection();
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, 200);
		pst.setString(2, "Anil");
		pst.setString(3, "Kumble");
		pst.setInt(4, 40);
		pst.executeUpdate();

		System.out.println("Successfully inserted a record in ArcusStudent table");

	}

	public static void updateData() {

		Connection con;
		try {
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(updateQuery);

			pst.setString(1, "Rahul");
			pst.setString(2, "Dravid");
			pst.setInt(3, 45);
			pst.setInt(4, 100);
			pst.executeUpdate();
			System.out.println("Successfully updated");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Unable to update the table");
			e.printStackTrace();
		}

	}

	public static void deleteData() {

		Connection con;
		try {
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(deleteQuery);

			pst.setInt(1, 100);
			pst.executeUpdate();

			System.out.println("Successfully Deleted....!!");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Unable to delete row from the table");
			e.printStackTrace();
		}

	}

	public static void getData() throws ClassNotFoundException, SQLException {

		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);

		int id = 0;

		while (rs.next()) {

			id = rs.getInt(1); //
			String firstName = rs.getString("firstname");
			String lastName = rs.getString("lastname");
			int age = rs.getInt(4);

			System.out.print("ID: " + id);
			System.out.print(", Firstname: " + firstName);
			System.out.print("Last Name: " + lastName);
			System.out.print(", age: " + age);

			System.out.println();

		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// createTable();

		// insertData();

		// updateData();

		System.out.println("Before deletion");
		getData();
		deleteData();
		System.out.println("After deletion");
		getData();

	}

}
