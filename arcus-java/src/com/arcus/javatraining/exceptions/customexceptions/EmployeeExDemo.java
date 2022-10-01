package com.arcus.javatraining.exceptions.customexceptions;

import java.util.Scanner;

public class EmployeeExDemo {

	int age;
	String name;

	EmployeeExDemo(String name, int age1) throws InvalidAgeException {

		// age =age;//assigning same inst var age to age var. i.e.default 0
		this.age = age1; // You are assigning value to your instance.. referring current object what ever
							// is using this constructor
		if (age < 18) {
			System.out.println(age +" is Invalid age");
			throw new UnderAgeException("This age is considered Under Age");
		}
		else if(age>60) {
			System.out.println(age +" is Invalid age");
			throw new InvalidAgeException("This age is considered Over Age");
		}else {
			System.out.println(age +" is valid age, proceed to next step");
		}

	}

	public static void main(String[] args) throws InvalidAgeException {

		EmployeeExDemo ex = new EmployeeExDemo("S", 30);
		System.out.println(ex.age);

		EmployeeExDemo ex1 = new EmployeeExDemo("S", 40);
		System.out.println(ex1.age);
		
		 Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the name of the Employee: ");
	      String name = sc.next();
	      System.out.println("Enter the age of the employee should be 18 to 24(including 18 and 24): ");
	      int age = sc.nextInt();
	      
	      EmployeeExDemo emp = new EmployeeExDemo(name, age);
	      
	      

	}

}
