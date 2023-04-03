package com.arcus;

//class demonstrating the usage of methods
public class MethodDemo {

	// static variables
	static int myint = 1000;
	static String myString;

	// instance variables
	int myanotherint = 100;
	String myanotherString;
	
	
	public void addNumbers() {
		System.out.println(myint+myanotherint);
	}
	
	
	//we cannot access instance varriables from static method. 
	public static void addNumbers1() {
		System.out.println(myint);
	}

	// main method
	public static void main(String[] args) {

		// Creating an object of MethodDemo class
		/*
		 * MethodDemo m1 = new MethodDemo(); MethodDemo m2 = new MethodDemo();
		 * 
		 * m1.myanotherint = 200; m2.myanotherint = 300;
		 * 
		 * System.out.println(m1.myanotherint); // 200
		 * System.out.println(m1.myanotherString);
		 * 
		 * System.out.println(m2.myanotherint); // 300
		 * System.out.println(m2.myanotherString);
		 * 
		 * System.out.println(m1.myint); // 1000
		 * 
		 * System.out.println(m2.myint); // 1000
		 * 
		 * m1.myint = 2000; System.out.println(m1.myint); // 2000
		 * System.out.println(m2.myint); //
		 * 
		 * 
		 * m1.addNumbers();
		 * 
		 * addNumbers1();
		 */
		

		System.out.println("1 + 2 = " + 1 + 2);

		System.out.println("1 + 2 = " + (1 + 2));

		
	}

}
