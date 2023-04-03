package com.arcus.javatraining.jdbc.txn;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;

public class WithoutTransactionExample {
	
	private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

	private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

	private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE" + "(" + " ID INT serial default value,"
			+ " NAME varchar(100) NOT NULL," + " SALARY numeric(15, 2) NOT NULL,"
			+ " CREATED_DATE timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP," + " PRIMARY KEY (ID)" + ")";

	private static final String SQL_TABLE_DROP = "DROP TABLE EMPLOYEE";

	public static void main(String[] args) {


		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ARCUS", "root", "password");
				Statement statement = conn.createStatement();
				PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);
				
				PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

			
			/*
			 * statement.execute(SQL_TABLE_CREATE); statement.execute(SQL_TABLE_DROP);
			 * 
			 * statement.execute(SQL_TABLE_CREATE);
			 */

			
			//"INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";
			// Run list of insert commands
			psInsert.setString(1, "sudheer");
			psInsert.setBigDecimal(2, new BigDecimal(10));
			psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			psInsert.execute();
			

			psInsert.setString(1, "prajeeth");
			psInsert.setBigDecimal(2, new BigDecimal(20));
			psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			psInsert.execute();

			// Run list of update commands
			
			//"UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";

			// below line caused error, test transaction
			// : No value specified for parameter 1.
		
			psUpdate.setBigDecimal(2, new BigDecimal(999.99));

			// psUpdate.setBigDecimal(1, new BigDecimal(999.99));
			psUpdate.setString(2, "sudheer");
			psUpdate.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}