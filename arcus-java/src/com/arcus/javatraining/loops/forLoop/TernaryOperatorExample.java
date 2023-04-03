package com.arcus.javatraining.loops.forLoop;

public class TernaryOperatorExample {

	public static void main(String[] args) {

		/*
		 * int num = 8; String msg = "";
		 * 
		 * 
		 * if(num > 10) { msg = "Number is greater than 10"; } else { msg =
		 * "Number is less than or equal to 10"; }
		 * 
		 * 
		 * msg = num > 10 ? "Number is greater than 10" :
		 * "Number is less than or equal to 10"; System.out.println(msg);
		 * 
		 * 
		 * 
		 * // variable declaration int n1 = 5, n2 = 10, max;
		 * 
		 * System.out.println("First num: " + n1); System.out.println("Second num: " +
		 * n2);
		 * 
		 * // Largest among n1 and n2 max = (n1 > n2) ? n1 : n2;
		 * 
		 * // Print the largest number System.out.println("Maximum is = " + max);
		 * 
		 * 
		 * 
		 * 
		 */

		/*
		 * int n1=15; int n2=10; int maximum;
		 * 
		 * if (n1>n2) { maximum=n1; System.out.println("Maximum number is "+maximum);
		 * }else { maximum=n2; System.out.println("Max number is "+maximum); }
		 */

		// variable declaration

		int n1 = 5, n2 = 10, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;

		// Print the largest number 
		System.out.println("Maximum is = " + max);
		
		
		

	}

}
