package com.arcus.javatraining.basics;

public class Employee {

	// instance variables
	int income;
	int age;

	// method without return type
	public void getSalary() {

		System.out.println("Employee salary is 20000");

	}

	// sets the value for instance variable salary
	public void setSalary(int sal) {

		this.income = sal;

	}

	// method with String return type
	public String retrieveEmpName() {
		String empName = "Sam";
		// return empName;
		return "Sam";

	}

	// method with int return type
	public int getAge() {

		int age = 36;
		// return 35;
		return age;
	}

	// method with int return type and arguments
	public static int calcTotalSal(int basic, int hra, int incentives) {

		int net_salary = basic + hra + incentives;
		return net_salary;
	}

	// main method
	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.getSalary();

		int age = emp.getAge();
		System.out.println(age);

		String empname = emp.retrieveEmpName();
		System.out.println(empname);

		System.out.println(emp.retrieveEmpName());

		int sal = calcTotalSal(1000, 2000, 3000);

		int net_sal = emp.calcTotalSal(1000, 2000, 3000);

		System.out.println(net_sal);

		emp.setSalary(10000);
		System.out.println(emp.income);

	}

}
