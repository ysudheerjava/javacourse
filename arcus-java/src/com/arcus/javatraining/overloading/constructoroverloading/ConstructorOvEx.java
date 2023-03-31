package com.arcus.javatraining.overloading.constructoroverloading;

public class ConstructorOvEx {

	String name;
	int id;

	ConstructorOvEx() {

	}

	ConstructorOvEx(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println("Name: " + name + " " + "Id" + id);

	}

	ConstructorOvEx(String name, int id, int x) {
		this.name = name;
		this.id = id;
		System.out.println("Name: " + name + " " + "Id" + id + "x: " + x);

	}

	public static void main(String args[]) {
		ConstructorOvEx con = new ConstructorOvEx();

		ConstructorOvEx obj1 = new ConstructorOvEx("Sudheer", 10);

		ConstructorOvEx obj2 = new ConstructorOvEx("Samantha", 20);

		/*
		 * System.out.println(con1.id); System.out.println(con.id);
		 */

		ConstructorOvEx obj3 = new ConstructorOvEx("Ram", 100, 20);
		System.out.println(obj3.id);
		System.out.println(obj3.name);

	}

}
