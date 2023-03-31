import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	int firstNumber;
	int secondNumber;
	boolean isPresent;

	static int attendees;
	static int total_present;
	static int total_absent;

	public void calculateSum(int a, int b) {
		System.out.println(a + b);

	}

	public int getAttendance(int attendance) {

		return attendance;
	}

	public static void main(String args[]) {
		System.out.println("Hello World!");
		Scanner input = new Scanner(System.in);
		int total_students = input.nextInt();

	

		/*
		 * if (attendance > 0) { present++; }
		 */

		Student student1 = new Student();
		student1.firstNumber = 10;
		student1.secondNumber = 10;
		student1.isPresent = true;

		Student student2 = new Student();
		student2.firstNumber = 10;
		student2.secondNumber = 10;
		student2.isPresent = true;

		Student student3 = new Student();
		student3.firstNumber = 10;
		student3.secondNumber = 10;
		student3.isPresent = false;

		Student[] stdArr = new Student[3];
		stdArr[0] = student1;
		stdArr[1] = student2;
		stdArr[2] = student3;
		
		

		for (int i = 0; i < total_students; i++) {

			/*
			 * if (stdArr[i].isPresent) { attendees++; System.out.println(); }
			 */
			
			int studentId = input.nextInt();
			int attendance = input.nextInt();
			
		}
		
		
		ArrayList al = new ArrayList();
		
		al.add(student1);
		al.add(student3);
		al.add("sss");
		

		System.out.println(attendees);

	}

}
