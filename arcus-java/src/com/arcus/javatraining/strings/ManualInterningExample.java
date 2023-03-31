package com.arcus.javatraining.strings;


//Example demonstrating String interning
public class ManualInterningExample {
	public static void main(String args[]) {

		String myInstitute= "Arcus"; //String pool
		
		String myCompany = new String("Arcus"); //not in pool

		System.out.println(myInstitute == myCompany);
	
		String internedString = myCompany.intern(); 		
		System.out.println(myInstitute == internedString);
		
		

	
		
		
		
	}

}
