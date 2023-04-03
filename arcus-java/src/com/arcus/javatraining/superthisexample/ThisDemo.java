package com.arcus.javatraining.superthisexample;

public class ThisDemo extends Superclass {

	int age;
	int x = 10;
	String name;

	ThisDemo(int age, String name) {

		super();
		this.age = age;
		this.name = name;
	}

	public void x() {

		this.y();
		super.y();
		super.z();

	}

	public void y() {

		System.out.println("Current class method");

	}

	public static void main(String[] args) {

		ThisDemo t = new ThisDemo(20, "Sam");
		System.out.println(t.age);
		System.out.println(t.name);

		System.out.println();

		ThisDemo t1 = new ThisDemo(25, "Ram");
		System.out.println(t1.age);
		System.out.println(t1.name);

		// t.displayDetails();

	}

}
