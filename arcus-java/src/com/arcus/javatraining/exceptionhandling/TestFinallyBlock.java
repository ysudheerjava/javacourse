package com.arcus.javatraining.exceptionhandling;

public class TestFinallyBlock {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
		}catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException e)
			{ System.out.println(e); 
			}
			 

		  finally { 
			  System.out.println("Inside the finally block");
			  System.out.println("finally block is always executed"); 
		}
		 

		System.out.println("rest of the code...");
	}
}