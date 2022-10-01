package com.arcus.javatraining.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 0;

		int[] arr = new int[2];

		try {
			System.out.println("Hello");// Statement1
			arr[3] = 10;// ArrayIndexOutofBounds
			System.out.println(i / j);// ArithmeticException

		}

		catch (ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException handled");

		}

		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("You are trying to divide a number with zero");
		}

		catch (Exception e) {

			// e.printStackTrace();
			e.getMessage();
			System.out.println("Exception");

		}
		
		finally{
			System.out.println("In finally block....");
		}

		System.out.println("Out side try catch finally blocks...");

	}

}
