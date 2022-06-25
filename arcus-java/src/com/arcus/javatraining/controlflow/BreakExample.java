package com.arcus.javatraining.controlflow;

class BreakExample {
	public static void main(String[] args) {
		int i = 5;
		/*
		 * if(i==5) { break; // error: break outside switch or loop }
		 */

		for (int j = 0; j < 10; j++) {
			
			if (j == 5) {
				break;
				//System.out.println("In if statement");
			}
			
			System.out.println(j);
		}
		System.out.println("outside of for loop");

	}
}