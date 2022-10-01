package com.arcus.javatraining.strings;

public class TestStrings {
	
	public static void main(String args[]) {
		
		String myName1 = new String("Khadeer");
		String myName2 = new String("Khadeer");
		
		String name1="Sudheer";
		String name2="Sudheer";
		

		System.out.println(name1==name2);//true
		System.out.println(name1.equals(name2));//true
		
		System.out.println(myName1==myName2);//false
		System.out.println(myName1.equals(myName2));//true
		
		
		myName1=myName1.concat("Khan");
		System.out.println(myName1);
		
		System.out.println();
	
		
		
		/*
		 * System.out.println(myName==myName1);
		 * 
		 * String myName3 = "Khadeer"; String myName4 = "Khadeer";
		 * 
		 * System.out.println(myName3==myName4);
		 * 
		 * System.out.println(myName.equals(myName1));//
		 */
		
		
		
		
	}

}
