package com.arcus.javatraining.array;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		

	 try (Scanner s = new Scanner(System.in)) {
		System.out.println("Please enter a number: ");
		 int number= s.nextInt();
		 
		 System.out.println("The number entered by the user: "+ number);
	}
	 
	 
	 
	 
	 

	}

}
