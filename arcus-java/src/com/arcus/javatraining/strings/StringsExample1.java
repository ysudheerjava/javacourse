package com.arcus.javatraining.strings;

public class StringsExample1 {

	public static void main(String args[]) {

		String myName = "Ram"; // String literal  1234
		String name = "Ram";
		String name2 = "Ram";

		String name3 = "Sam";
		String name4 = "Sam";
		String name5 = "Sam";

		System.out.println(myName == name); // true
		System.out.println(myName.equals(name));// true

		String myName1 = new String("Ram");
		String myName2 = new String("Ram");
		String myName3 = new String("Ram");

		System.out.println(myName1 == myName2); // false
		System.out.println(myName1.equals(myName2));// true
		

		myName.concat(name3); //
		System.out.println(myName);
		
		

	}

}
