package com.arcus.javatraining.staticexample;

class Employee {
	
	int id = 100;
	
	static int staticid = 1000;
	
	String name = "XYZ";
	
	static String org = "Arcus";

	Employee(int id, String name) {
		
		 int i =10;
		this.id = id;
		this.name = name;
	}
	
	Employee(int id, String name,String org) {
		
		 int i =20;
		this.id = id;
		this.name = name;
		this.org=org;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(id + " " + name + " " + org);
	}
	

}