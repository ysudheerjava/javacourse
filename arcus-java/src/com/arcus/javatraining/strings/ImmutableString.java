package com.arcus.javatraining.strings;

import java.util.*;

class ImmutableString {
	public static void main(String args[]) {
		
		String newString = "Hello";  //String literal
		
		//immutable  immutability
		
		
	//String concatenation
		
		System.out.println("My own sring" + newString);
		
		String modifiedString=newString.concat(" World");
		
		System.out.println(modifiedString);
		
		
		
		System.out.println(newString);
		System.out.println(modifiedString);
		
		
		//different methods provided by String class
		
		String wish= "Wish you happy birthday";
		

		System.out.println(newString.charAt(0));
		
		boolean result = wish.endsWith("birthday");
		
		System.out.println(result);
		
	//	boolean result2 = firstString.startsWith("Fir");
		
		//System.out.println(firstString.length());
		
		String myString ="Sudheer";
		String myString2 = new String("Sudheer");
		
		
		System.out.println(myString.length());
		
		System.out.println(myString.isEmpty());
		
		
		System.out.println(myString == myString2);
		
		System.out.println(myString.equals(myString2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	newString.concat("Arcus");
		
		
		
		
		
		
		
		
		
		
		
	}
}