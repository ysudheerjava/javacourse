package com.arcus.javatraining.strings;

import java.util.*;

class ImmutableString {
	
	
	public static void main(String args[]) {

		
		String newString = "Hello"; // String literal

		// immutable immutability

		// String concatenation

		System.out.println("My own sring" + newString);

		String modifiedString = newString.concat(" World");
		
		

		System.out.println(modifiedString);

		System.out.println(newString);
		System.out.println(modifiedString);
		
		

	}
}