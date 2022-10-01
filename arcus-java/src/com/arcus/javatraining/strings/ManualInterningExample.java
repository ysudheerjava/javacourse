package com.arcus.javatraining.strings;

public class ManualInterningExample {
	public static void main(String args[]) {

		//String constantString = "Sudheer";
		
		String myName= "Sudheer"; //String pool
		
		String myName1 = new String("Sudheer"); //not in pool

		System.out.println(myName == myName1);
	
		String internedString = myName1.intern(); //myName1 is moved to String literal pool
		
		System.out.println(myName == internedString);

		/*
		 * String internedString = myName.intern();
		 * 
		 * System.out.println(constantString == internedString);
		 */
		
		
		
	}

}
