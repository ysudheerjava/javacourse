package com.arcus.javatraining.methodoverriding;

public class WiproEmployee extends Employee {

	
	public void calculateSalary(int basic, int hra,int allowances) {

		int Total_salary = basic + hra+ allowances;
		
		System.out.println(Total_salary);
	}
	
	
	public static void main(String[] args) {
		WiproEmployee emp = new WiproEmployee();
		emp.calculateSalary(2000, 3000,1000);
		
	
	}
}