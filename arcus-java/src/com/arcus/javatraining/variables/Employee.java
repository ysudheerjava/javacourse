package com.arcus.javatraining.variables;
public class Employee {

	// instance variables
	int empId;
	int age;
	String empName;
	static String companyName = "Arcus";

	// no argument constructor
	Employee() {
	}
	// Constructor with 3 arguments
	Employee(int empID, int age, String empname) {
		this.empId = empID;
		this.age = age;
		this.empName = empname;
	}


	public static void main(String[] args) {
		Employee emp2 = new Employee(100, 25, "Dhoni");
		Employee emp3 = new Employee(102, 43, "Modi");

		System.out.println(emp2.empId);
		System.out.println(emp2.age);
		System.out.println(emp2.empName);
		System.out.println(emp2.companyName);
		
		System.out.println(emp3.empId);
		System.out.println(emp3.age);
		System.out.println(emp3.empName);
		System.out.println(emp3.companyName);

	}

}
