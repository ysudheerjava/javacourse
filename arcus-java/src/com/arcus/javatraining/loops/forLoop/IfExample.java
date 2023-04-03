package com.arcus.javatraining.loops.forLoop;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a percetage: ");
	int marks =sc.nextInt();

	System.out.println("You have entered "+marks);
	
	if (marks> 35 && marks <60) {
		System.out.println("Just Passed");
	}
	else if(marks>=60 && marks <=70) {
		System.out.println("First class");
		
	}
	else if (marks >70) {
		System.out.println("Distinction");
	}
	else {
		System.out.println("...");
	}
	
	
	 
	}

}
