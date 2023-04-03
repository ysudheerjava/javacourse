package student_package;

import java.sql.SQLException;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		CrudOperations s=new CrudOperations();
		while (true) {
			System.out.println("1. Create a student");
			System.out.println("2.  retrive_student_by_id");
			System.out.println("3. list_all_students");
			System.out.println("4. update_Student");
			System.out.println("5. delete_student");
			System.out.println("6. Exit");
			while (true) {
				System.out.println("Enter choice : ");
				ch = sc.nextInt();
				if (ch < 1 || ch > 6) {
					System.out.println("Please enter a valid choice [ 1 through 6 ]");
					continue;
				} else
					break;
			}
			switch (ch) {
			case 1:
				System.out.println("create account");
                s.createStudent();
                break;
			case 2:
				System.out.println("retrive_student_by_id");
                s.retrive_student_by_id();
                break;
			case 3:
				System.out.println("list_all_students");
                s.list_all_students();
                break;
			case 4:
				System.out.println("update_Student");
				s.update_Student();
				 break;
			case 5:
				System.out.println("delete_student");
				s.delete_student();
				 break;
			case 6:
				System.exit(0);
		}
	}
}
}
