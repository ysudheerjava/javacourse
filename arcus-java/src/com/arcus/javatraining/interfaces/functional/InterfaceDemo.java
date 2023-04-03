package com.arcus.javatraining.interfaces.functional;

@FunctionalInterface
public interface InterfaceDemo {
	
	public void add(int i, int j);
	
	//public void displayText1(); // abstract method

//	public void displayText2(); // abstract method

	/* Default methods in Interface introduced from Java 8 onwards */

	default void doSomething1() {

		System.out.println("Default method1 in interface");
	}

	default void doSomething2() {

		System.out.println("Default method2 in interface");
	}

	public static void doSomethingElse1() {
		System.out.println("Static method1 in Interface");
	}

	public static void doSomethingElse2() {
		System.out.println("Static method2 in Interface");
	}

}
