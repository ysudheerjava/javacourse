package com.arcus.javatraining.methodoverriding;

public class AccentureEmployee extends Employee {

	public void calculateSalary(int basic, int hra, int allowances) {

		int otherBenefits = 1000;
		int gross_salary = basic + hra + allowances + otherBenefits;
		System.out.println("calculateSalary() method in AccentureEmployee class");
		System.out.println(gross_salary);
	}

	public static void main(String[] args) {

		AccentureEmployee emp1 = new AccentureEmployee();
		emp1.employeePolicies();
		
		emp1.calculateSalary(1000, 1000, 1000);

	}

}
