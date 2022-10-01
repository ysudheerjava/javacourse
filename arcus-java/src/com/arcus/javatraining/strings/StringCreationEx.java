package com.arcus.javatraining.strings;

public class StringCreationEx {

	public static void main(String args[]) {

		String myString = "7"; // way to create a string literal
		String myString2 = "Apple";
		
		System.out.println(myString.indexOf(7));
		
		 String s1 = "This is indexOf method";         
	        // Passing Substring    
	        int index = s1.indexOf("method"); //Returns the index of this substring  
	        System.out.println("index of substring "+index);      
	        
	        
	        String s2 = "This is indexOf method";         
	        // Passing Substring    
	        int index1 = s1.indexOf("method"); //Returns the index of this substring  
	        System.out.println("index1 of substring "+index1);          
	        
		
		System.out.println(myString == myString2);
		System.out.println(myString.equals(myString2));
		
		String myString3 = new String("Apple"); // way to create a string literal
		String myString4 = new String("Apple");

		System.out.println(myString3 == myString4);
		System.out.println(myString3.equals(myString4));

	}

}
