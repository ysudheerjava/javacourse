package com.arcus.javatraining.exceptionhandling;

class ExceptionTest {

	

	public static void main(String[] args) {
		try {
			/*
			 * int a = 10; int b = 0; int division = a / b;
			 * 
			 * System.out.println(division);
			 */
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Please check the number ...");
		}

		finally {
			System.out.println("In finally block");
		}
	}

}