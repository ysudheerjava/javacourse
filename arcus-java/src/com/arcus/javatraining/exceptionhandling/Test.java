package com.arcus.javatraining.exceptionhandling;

public class Test
{
public static void main(String[] args){ 
	
	System.out.println("statement1"); 
	try {
	System.out.println(10/0); 
	System.out.println("Another statement");
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("statement4");
		
	}
	System.out.println("statement 5");
}
}

