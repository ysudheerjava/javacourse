package com.arcus.javatraining.exceptionhandling;

public class NestTry {
	public static void main(String args[]) {
		try {
			int a = args.length;
			int b = 42 / a;
			System.out.println("a = " + a);
			try { // nested try block
				if (a == 1)
					a = a / (a - a); // one command-line arg, division by zero
				if (a == 2) {
					int c[] = { 1 };
					c[42] = 99; // two command-line args, out-of-bounds exception
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out-of-bounds: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}
	}
}