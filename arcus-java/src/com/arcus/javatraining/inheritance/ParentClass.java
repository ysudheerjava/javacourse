package com.arcus.javatraining.inheritance;

public class ParentClass {

	int parentAge;

	static int age = 50;

	public String sayHello() {
		// String greeting= "Hello";
		return "Hello";
	}

	public static int getParentAge() {

		return age;
	}

	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		System.out.println(parent.sayHello());
		System.out.println(getParentAge());
	}

}
