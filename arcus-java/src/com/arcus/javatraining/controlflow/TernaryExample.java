package com.arcus.javatraining.controlflow;

/*This class demonstrates the usage of if condition
 * */
public class TernaryExample {

	/* This method is used to test Ternary operator */
	public static int ternaryTest(int num1, int num2) {

		int num = (num2 > num1) ? (num1 + num2) : (num1 - num2);

		return num;

	}

	public static String ternaryTest(int credits) {

		String year = credits < 30 ? "freshman" : credits <= 59 ? "sophomore" : credits <= 89 ? "junior" : "senior";
		return year;
	}

	public static void main(String[] args) {

		int year = ternaryTest(90, 10);
		System.out.println(year);
	}

}
