package com.arcus.javatraining.staticexample;

class Employee {
	int id;
	String name;
	static String org = "Arcus";

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name + " " + org);
	}
	

}