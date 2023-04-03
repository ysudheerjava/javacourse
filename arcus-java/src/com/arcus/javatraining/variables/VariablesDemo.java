package com.arcus.javatraining.variables;

public class VariablesDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.empId = 100;
		emp1.age = 40;
		emp1.empName = "Amit";
		Employee emp2 = new Employee();
		emp2.empId = 200;
		emp2.age = 33;
		emp2.empName = "Binny";
		System.out.println(emp1.companyName);

	}

}
