package com.arcus.javatraining.array;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a int number: ");
		int num = s.nextInt();
		System.out.println("You have entered the int: "+ num);
		
		s.close();
		
	
	}

}
