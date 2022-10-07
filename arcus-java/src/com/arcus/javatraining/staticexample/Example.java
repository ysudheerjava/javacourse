package com.arcus.javatraining.staticexample;

public class Example {
	static String name;
	static int age;

	Example() {
		name = "Stalin";
		age = 25;
	}

	public static void main(String args[]) {
		new Example();
		System.out.println(Example.name);
		System.out.println(Example.age);
	}
}