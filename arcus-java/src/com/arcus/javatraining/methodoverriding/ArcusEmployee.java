package com.arcus.javatraining.methodoverriding;

public class ArcusEmployee extends Employee {

	public static void main(String[] args) {

		ArcusEmployee ae = new ArcusEmployee();
		ae.calculateSalary(1000, 1000, 100);

		ae.employeePolicies();

	}

}
