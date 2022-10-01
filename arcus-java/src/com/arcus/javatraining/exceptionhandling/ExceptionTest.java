package com.arcus.javatraining.exceptionhandling;

class ExceptionTest {

	public  void method1() {
		method2();
	}

	public void method2() {

		System.out.println("Hello");

		try {
			int a = 10;
			int b = 0;

			int division = a / b;

			System.out.println(division);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Please check the number ...");
		}
	}

	public static void main(String[] args) {

		ExceptionTest e = new ExceptionTest();
		e.method1();
	//	method1();
		
		
		System.out.println("After >>>>>>>>>>>>>>>>>>>>>>>>>>>");

	}

}