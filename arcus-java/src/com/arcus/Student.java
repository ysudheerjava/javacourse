package com.arcus;

public class Student {

	int rollNo;
	String name;

	Student() {
	}

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void getStudentDetails() {
		System.out.println("RollNo:" + rollNo);
		System.out.println("Name:" + name);
	}

	public static void main(String[] args) {

		Student std = new Student();
		
		
		std.rollNo = 20;
		std.name = "John";

		std.getStudentDetails();

		Student std1 = new Student(30, "Akshay");

		std1.getStudentDetails();

	}

}
