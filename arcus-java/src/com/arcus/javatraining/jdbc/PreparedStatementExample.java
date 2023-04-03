package com.arcus.javatraining.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementExample {
	
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());

      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/employee";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      System.out.println("Connection established......");

      //Creating a Prepared Statement
      String query = "INSERT INTO Employees(id,age, first, last) VALUES (?,?, ?, ?)";
      
      PreparedStatement pstmt = con.prepareStatement(query);

      pstmt.setInt(1, 400);
      pstmt.setInt(2, 21);
      pstmt.setString(3, "Abhishek");
      pstmt.setString(4, "Dravid");
      pstmt.executeUpdate();
     
      pstmt.setInt(1, 401);
      pstmt.setInt(2, 33);
      pstmt.setString(3, "Fanesh");
      pstmt.setString(4, "Shetty");
      int num = pstmt.executeUpdate();
      
      System.out.println(num);
      System.out.println("Rows inserted ....");
   }
}