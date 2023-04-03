package com.arcus.javatraining.array;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		System.out.println("Please enter the String: ");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("You have entered the number: "+ num);
		System.out.println("You have entered the String: "+ str);
	
		
		

	}

}
