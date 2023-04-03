package com.arcus.javatrainings.java8features;

public class Java8InterfaceImpl implements Java8InterfaceExample1, Java8InterfaceExample2 {

	public void doSomething1() {

		System.out.println("Hello");

	}

	public void doSomething2() {

		System.out.println("Hi");

	}

	public int doAddition(int i, int j) {

		return Java8InterfaceExample1.super.doAddition(i, j);
	}

	public static void main(String[] args) {

		Java8InterfaceImpl j8 = new Java8InterfaceImpl();
		j8.doSomething1();
		j8.doSomething2();

		int sum = j8.doAddition(10, 20);
		System.out.println("Sum of 2 numbers: " + sum);

		Java8InterfaceExample1.printSomething("Arcus");

	}

}
