package com.arcus.javatraining.array;

public class Main {
	public static void main(String args[]) {
		Employee[] emp = new Employee[2];
		System.out.println(emp[0]);
		emp[0] = new Employee();
		emp[1] = new Employee();
		emp[0].setData(1, "ABC");
		emp[1].setData(2, "XYZ");
		emp[0].displayData();
		emp[1].displayData();
	}
}