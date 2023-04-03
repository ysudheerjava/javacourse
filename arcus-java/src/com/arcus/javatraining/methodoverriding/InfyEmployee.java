package com.arcus.javatraining.methodoverriding;

public class InfyEmployee extends Employee {

	public void calculateSalary(int basic, int hra, int allowances) {
		System.out.println("calculateSalary() method in InfyEmployee class");
		int gross_salary = basic + hra + 2 * allowances;
		System.out.println(gross_salary);
	}

	public static void main(String[] args) {

		InfyEmployee infyemp = new InfyEmployee();
		infyemp.employeePolicies();
		
		infyemp.calculateSalary(1000, 1000, 1000);

	}

}
