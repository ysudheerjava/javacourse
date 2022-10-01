package com.arcus.javatraining.exceptionhandling;

class MultipleCatches {
	public static void main(String args[]) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 42 / a; 
			
			int c[] = { 1,2,3 };
			System.out.println("Length of array c[]: "+c.length);
		    c[5] = 99;
			
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}