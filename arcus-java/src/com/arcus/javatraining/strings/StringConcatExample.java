package com.arcus.javatraining.strings;

public class StringConcatExample {
	
	public static void main(String args[]) {
		
		//Using the concat()  method to combine two strings;
		
		String firstString = "First String"; //created using literal
		
		String secondString=  new String("Second String"); // created using new operator in String constructor
		
		String concatenatedString = firstString.concat(secondString);
		System.out.println(concatenatedString);
		
		System.out.println(firstString.charAt(2));
		
		boolean result = firstString.endsWith("xssss");
		
		boolean result2 = firstString.startsWith("Fir");
		
		System.out.println(firstString.length());
		
		
		System.out.println(result2);
	}

}
