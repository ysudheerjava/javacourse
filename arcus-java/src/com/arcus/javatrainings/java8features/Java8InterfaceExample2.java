package com.arcus.javatrainings.java8features;

public interface Java8InterfaceExample2 {


	default int doAddition(int i, int j) {
		return i + j;
	}

	public static void printSomething(String s) {

		System.out.println("Printing: " + s);

	}

}
