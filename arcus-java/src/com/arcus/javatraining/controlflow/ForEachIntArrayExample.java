package com.arcus.javatraining.controlflow;

public class ForEachIntArrayExample {
	public static void main(String args[]) {

		int[] myArray = { 10, 20, 30, 40 };

		System.out.print("Elements of Array: " + "\n");
		
		for(int i:myArray) {
			
			System.out.println(i);
			
		}
	

		/*
		 * for(int i=0; i<myArray.length; i++) {
		 * 
		 * System.out.println(myArray[i]);
		 * 
		 * }
		 */

	}
}