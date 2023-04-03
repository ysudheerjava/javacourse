package com.arcus;

public class Employee {

	int empId;
	String name;

	Employee(int x, String y) {

		empId = x;
		name = y;
	}

	Employee() {
	}

	public void doAddition() {
		int firstNum = 10;
		int secondNum = 20;
		System.out.println(firstNum + secondNum);
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.empId = 100;
		emp.name = "Kumar";

		Employee emp1 = new Employee(100, "Ramesh");
		emp1.doAddition();

	}

}
