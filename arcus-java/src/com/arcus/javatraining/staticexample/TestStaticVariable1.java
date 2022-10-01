package com.arcus.javatraining.staticexample;

//Java Program to demonstrate the use of static variable  

//Test class to show the values of objects  
public class TestStaticVariable1 {

	public static void main(String args[]) {

		Employee emp1 = new Employee();
		// System.out.println("emp1 id Initial value:"+emp1.id); //100

		System.out.println("emp1 staticid Initial value:" + emp1.staticid); // 1000
		emp1.staticid = 2000;

		System.out.println("emp1 staticid Modified value:" + emp1.staticid); // 2000

		Employee emp2 = new Employee();
		System.out.println("emp2 staticid Initial value:" + emp2.staticid); // 2000

		Employee emp3 = new Employee();
		System.out.println("emp3 staticid Initial value:" + emp3.staticid); // 2000
		emp3.staticid = 3000;
		System.out.println("emp3 staticid Modified value:" + emp3.staticid); // 3000

		System.out.println("emp1 staticid Initial value:" + emp1.staticid); // 3000
		System.out.println("emp2 staticid Initial value:" + emp2.staticid); // 3000
		System.out.println("emp3 staticid Initial value:" + Employee.staticid); // 3000

		/*
		 * emp1.id = 200; System.out.println("emp1 id after modidfying:"+ emp1.id);
		 * //200
		 * 
		 * 
		 * 
		 * Employee emp2 = new Employee();
		 * 
		 * System.out.println("emp2 id Initial value: "+emp2.id); //100
		 * 
		 * emp2.id = 300; System.out.println("emp2 id after modidfying:"+ emp2.id);
		 * //300
		 * 
		 * Employee emp3 = new Employee();
		 * System.out.println("emp3 id Initial value: "+emp3.id); //100
		 * 
		 * emp3.id = 400; System.out.println("emp3 id after modidfying:"+ emp3.id);
		 * //400
		 */

		/*
		 * Employee employee1 = new Employee(111, "Sunil Kumar"); Employee employee2 =
		 * new Employee(222, "Prabhu kumar"); Employee employee3 = new Employee(333,
		 * "Sudheer kumar","Amazon");
		 */
		// we can change the org of all objects by the single line of code
		// Employee.org="Google";
		/*
		 * .display();
		 * 
		 * employee1.id = 20;
		 * 
		 * 
		 * employee2.display(); employee3.display();
		 */
	}
}