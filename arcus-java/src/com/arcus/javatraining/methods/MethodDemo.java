package com.arcus.javatraining.methods;

public class MethodDemo {

	// Method without arguments, without any return type

	public void sayHello() {
		System.out.println("Hello");

	}

	// Method with argument, with out a return type
	public void printText(String str) {
		System.out.println(str);
	}

	public void printEmployeeDetails(String name, int id) {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);

	}

	// Method with return type, without arguments
	public String printString() {
		System.out.println("Method with return type");
		String myString = "Hello ARcus";
		return myString;
	}

	public static int printInt() {
		int myInt = 100;
		return myInt;
	}

	// method with return type, with arguments

	public boolean isQualified(int mark) {

		boolean result = false;

		if (mark > 35) {
			result = true;
			return result;
		} else if (mark < 35) {
			return result;
		}

		return result;
	}

	public String sayHi(String str) {
		String mystring = "Hi " + str;
		return mystring;
	}

	public static void main(String[] args) {

		MethodDemo md = new MethodDemo();

		/*
		 * String myText = "Welcome to Java"; md.printText(myText);
		 * 
		 * md.printEmployeeDetails("Amit", 100);
		 * 
		 * md.printEmployeeDetails("Kumar", 200);
		 */

		/*
		 * String myString =md.printString(); System.out.println(myString);
		 * 
		 * int myIntval = md.printInt(); System.out.println(myIntval);
		 * 
		 * printInt();
		 */

		/*
		 * boolean result =md.isQualified(38); System.out.println("Result: "+result);
		 * 
		 * System.out.println(md.isQualified(55));
		 */

		String returnedString = md.sayHi("Bhaskar");
		System.out.println(returnedString);

	}

}
