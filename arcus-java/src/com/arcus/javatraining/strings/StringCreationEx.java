package com.arcus.javatraining.strings;

public class StringCreationEx {

	public static void main(String args[]) {

		String myString = "Apple"; // way to create a string literal
		String myString2 = "Apple";
		
		//System.out.println(myString == myString2);

		String myString1 = new String("Apple"); // creating a string object
	
		String myString3 = new String("Apple");
		
		//System.out.println(myString1 == myString3);
		
		System.out.println(myString1);
		
		String newString = myString1.concat(" is tasty");
		
		System.out.println("myString1: "+myString1);
		
		System.out.println("newString: "+newString);
		
		
		StringBuffer and StringBuilder
	
		

	}

}
