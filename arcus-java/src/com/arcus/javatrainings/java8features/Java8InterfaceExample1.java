package com.arcus.javatrainings.java8features;

public interface Java8InterfaceExample1 {

	public void doSomething1();


	default int doAddition(int i, int j) {
		return i + j;
	}

	public static void printSomething(String s) {

		System.out.println("Printing: " + s);

	}

}
