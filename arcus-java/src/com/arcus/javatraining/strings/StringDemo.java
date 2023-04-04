package com.arcus.javatraining.strings;

public class StringDemo {

	public static void main(String[] args) {

		String myCountry = new String("India");
		String friendsCountry = new String("india");
		
		String n= myCountry +"is great";

		// == and .equals() method
		/*
		 * System.out.println(myCountry == friendsCountry);
		 * System.out.println(myCountry.equals(friendsCountry));
		 */

		// String literals
		String greeting = "Hello"; // created in a special memory area called String Constant Pool or String pool
		String greeting1 = "hello";

		/*
		 * System.out.println(greeting == greeting1);
		 * 
		 * System.out.println(greeting.equals(greeting1));
		 */
		
		//concatenation of String se  -- joining or combining of Strings
		System.out.println(myCountry);
		
		
		System.out.println(myCountry+friendsCountry);
		
		System.out.println(myCountry.concat(friendsCountry));
		
		System.out.println(myCountry.charAt(0));
		System.out.println(myCountry.charAt(1));
		
		System.out.println(myCountry.length());
		
		System.out.println(myCountry.endsWith("a"));
		
		System.out.println(myCountry.startsWith("I"));
		
		System.out.println(myCountry.toUpperCase());
		System.out.println(myCountry.compareToIgnoreCase(friendsCountry));
		
		System.out.println(myCountry.isEmpty());
		
		System.out.println(myCountry.);
		
		
		

	}

}
