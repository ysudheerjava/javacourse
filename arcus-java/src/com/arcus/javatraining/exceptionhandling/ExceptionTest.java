package com.arcus.javatraining.exceptionhandling;

class ExceptionTest {

	public void doSomething() {
		System.out.println("Non Static method");
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		
		System.out.println("Hello");
		int a = 10;
		int b =0;

		int division = a / b;

		System.out.println(division);
	}

	public static void main(String[] args) {

		 doStuff();

		
		/*
		 * ExceptionTest myInstance = new ExceptionTest(); myInstance.doSomething();
		 */

	}

}