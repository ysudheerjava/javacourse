package com.arcus.javatraining.
methodoverriding;

public class Employee {

	public void calculateSalary(int basic, int hra, int allowances) {

		System.out.println("calculateSalary() method in Employee class");

		int gross_salary = basic + hra + allowances;
		System.out.println(gross_salary);
	}

	
	public String employeePolicies() {
		return "Standard Employee Policies";
	}
	
	
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.calculateSalary(1000, 500, 100);

	}

}
