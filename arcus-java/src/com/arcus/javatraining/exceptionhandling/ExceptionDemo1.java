package com.arcus.javatraining.exceptionhandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("Statement 1");
		int num1 = 10;
		int num2 = 0;

		System.out.println("Statement 2");
		System.out.println(":::::::::String array:::::::::::");
		String strArr[] = { "India", "is", "great" };
		System.out.println(strArr[0]);

		System.out.println(strArr[1]);
		System.out.println(strArr[2]);

		try {
			/*
			 * System.out.println(strArr[3]);// ArrayIndexOutofBounds exception causing int
			 * divResult = num1 / num2;// exception causing code
			 * System.out.println("result: " + divResult);
			 */

		} /*
			 * catch (ArrayIndexOutOfBoundsException e) { e.printStackTrace();
			 * 
			 * } catch (ArithmeticException ex) { System.out.println("Statement 3");
			 * ex.printStackTrace(); }
			 */
		  finally{ 
			  System.out.println("In finally block....."); }
		 
		System.out.println("Statement 4");
		System.out.println("Statement 5");

	}

}