package com.arcus.javatraining.manasa.constructor;

public class Employee {

	int id;
	String name;
	int age;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public Employee(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Employee() {

	}

	public void displayDetails() {
		System.out.println("Employee ID: " + id + "|" + "Emp name: " + name + "|" + "Emp age: " + age);
	}
	
	
	public int getSum(int a, int b) {
		return a+b;
	}
	
	public int getSum(int a, int b,int c) {
		return a+b+c;
	}
	
	public int getSum(int a, int b,int c,int d) {
		return a+b+c+d;
	}
	
	

}
