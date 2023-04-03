package com.arcus.javatraining.exceptionhandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		int i =10;
		int j =0;
		
		try {
		System.out.println(" Before division of a number with zero");
		System.out.println(i/j);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("After division of a number with zero");
		
		
	}

}
