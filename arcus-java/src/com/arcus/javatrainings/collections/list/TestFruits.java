package com.arcus.javatrainings.collections.list;

import java.util.Scanner;

public class TestFruits {

	public String[] addFruits() {
		String[] fruits = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three fruits: ");
		for (int i = 0; i < fruits.length; i++) {

			fruits[i] = sc.nextLine();
		}
		return fruits;
	}
	
	
	/*
	 * public void addFruits() { String[] fruits = new String[3]; Scanner sc = new
	 * Scanner(System.in); System.out.println("Please enter three fruits: "); for
	 * (int i = 0; i < fruits.length; i++) {
	 * 
	 * fruits[i] = sc.nextLine(); } }
	 */

	public void displayFruits(String[] fruits) {
		
		//String[] fruits= addFruits();
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
	}

	public static void main(String args[]) {
		TestFruits t = new TestFruits();

		System.out.println("Adding fruits");

		String[] fruits = t.addFruits();
		
		System.out.println("Displaying fruits");
		t.displayFruits(fruits);

	}

}
