package com.arcus.javatraining.overloading.constructoroverloading;

public class Employee {

	String name;
	int id;

	Employee() {
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Name: " + name + " " + "Id: " + id);

	}

	Employee(int id) {
		this.id = id;
		System.out.println("Name: " + name + " " + "Id: " + id);

	}

	public static void main(String args[]) {

		Employee emp = new Employee(100, "Arcus");
		Employee emp1 = new Employee(100);
		Object[] objects = new Object[3];
		objects[0] = "foo";
		objects[1] = 5;
		objects[2] = 2.5;
		for (Object i : objects) {
			System.out.println(i);
		}

	}

}




