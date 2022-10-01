package com.arcus.javatrainings.java8features.interfaces;

@FunctionalInterface
interface MyInterface {

	// abstract method in interface
	void show(int a, int b);

	// default method in java 8 interface
	default int doAddition(int arg1, int arg2) {

		return arg1 + arg2;

	}

	// static method in interface
	static void displayText() {
		System.out.println("Hello from Static method");
	}

}
