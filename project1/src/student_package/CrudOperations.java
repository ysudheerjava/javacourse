package student_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudOperations {
	/*
	 * int student_id; String student_name; int student_age; String gender; String
	 * education; int year_passed; String course;
	 */

	public static final String cquery = "insert into student_details(student_id,student_name,student_age,gender,education,year_passed,course)values(?,?,?,?,?,?,?)";
	public static final String squery = "select*from student_details where student_id=?";
	public static final String slquery = "select*from student_details";
	public static final String usquery = "select*from student_details where student_id=?";
	public static final String uquery = "update student_details set student_name=?,student_age=?,gender=?,education=?,year_passed=?,course=? where student_id=?";
	public static final String dquery = "delete from student_details where student_id=? ";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema", "root", "jaya");
		// System.out.println("connection successfully");
		return con;
	}

	// create Student

	public void createStudent() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id: ");
		Integer student_id = sc.nextInt();

		System.out.println("enter the student_name: ");
		sc.nextLine();
		String student_name = sc.nextLine();

		System.out.println("enter the student_age : ");
		Integer student_age = sc.nextInt();
		System.out.println("enter the student_gender: ");
		sc.nextLine();
		String gender = sc.nextLine();

		System.out.println("enter the student_education: ");
		String education = sc.nextLine();

		System.out.println("enter the year passedout: ");
		Integer year_passed = sc.nextInt();

		System.out.println("enter the student_course: ");
		sc.nextLine();
		String course = sc.nextLine();

		PreparedStatement ps = con.prepareStatement(cquery);
		ps.setInt(1, student_id);
		ps.setString(2, student_name);
		ps.setInt(3, student_age);
		ps.setString(4, gender);
		ps.setString(5, education);
		ps.setInt(6, year_passed);
		ps.setString(7, course);
		ps.executeUpdate();
		System.out.println("create successfully");
	}

	public void retrive_student_by_id() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id: ");
		Integer student_id = sc.nextInt();

		PreparedStatement ps = con.prepareStatement(squery);
		ps.setInt(1, student_id);

		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rms = rs.getMetaData();

		int n = rms.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= n; i++) {
				String val = rs.getString(i);
				System.out.println(rms.getColumnName(i) + ":" + val + " ");
			}
		}
		if (!rs.next()) {
			System.out.println("ID Not found");
		}

	}

	// list all the students
	public void list_all_students() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(slquery);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rms = rs.getMetaData();

		int n = rms.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= n; i++) {
				String val = rs.getString(i);
				System.out.println(rms.getColumnName(i) + ":" + val + " ");
			}
			System.out.println(" ");
		}

	}

	// Update Student
	public void update_Student() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the id: ");
		Integer student_id = sc.nextInt();

		PreparedStatement pst = con.prepareStatement(usquery);
		pst.setInt(1, student_id);

		ResultSet rs = pst.executeQuery();
		// ResultSetMetaData rms=rs.getMetaData();

		if (rs.next()) {
			// System.out.println("enter the id: ");
			// Integer student_id=sc.nextInt();

			System.out.println("enter the student_name: ");
			sc.nextLine();
			String student_name = sc.nextLine();

			System.out.println("enter the student_age : ");
			Integer student_age = sc.nextInt();

			System.out.println("enter the student_gender: ");
			sc.nextLine();
			String gender = sc.nextLine();

			System.out.println("enter the student_education: ");
			String education = sc.nextLine();

			System.out.println("enter the year passedout: ");
			Integer year_passed = sc.nextInt();

			System.out.println("enter the student_course: ");
			sc.nextLine();
			String course = sc.nextLine();

			PreparedStatement ps = con.prepareStatement(uquery);
			ps.setInt(7, student_id);
			ps.setString(1, student_name);
			ps.setInt(2, student_age);
			ps.setString(3, gender);
			ps.setString(4, education);
			ps.setInt(5, year_passed);
			ps.setString(6, course);
			ps.executeUpdate();
			System.out.println("updated successfully");

		} else {
			System.out.println("ID Not found");
		}
	}

	public void delete_student() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id: ");
		Integer student_id = sc.nextInt();

		PreparedStatement ps = con.prepareStatement(dquery);
		ps.setInt(1, student_id);
		int s = ps.executeUpdate();
		if (s == 1) {
			System.out.println("delete student");
		} else {
			System.out.println(" id not found ");
		}
	}

	/*
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { // createStudent(); // getConnection(); //
	 * retrive_student_by_id(); // list_all_students(); // update_Student();
	 * delete_student(); }
	 */

}
