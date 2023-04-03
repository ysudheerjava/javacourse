package com.arcus.javatraining.exceptionhandling;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;

		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("You will get arithmetic exception when you try to divide with zero, change");
			// e.printStackTrace();
		}

		System.out.println("End of the Program");

	}

}
