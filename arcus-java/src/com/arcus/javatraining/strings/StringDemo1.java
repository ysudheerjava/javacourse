package com.arcus.javatraining.strings;

public class StringDemo1 {

	public static void main(String[] args) {

		String company = "Arcus"; //literal
		String company1 = "Arcus";

		/*
		 * System.out.println(company); System.out.println(company1);
		 * System.out.println();
		 */
		
		String myCompany = new String ("Arcus");  //new string object will be created in heap
		String myCompany1 = new String ("Arcus");//another new string object wll be created in the pool
		
		/*
		 * System.out.println(myCompany); System.out.println(myCompany1);
		 * System.out.println();
		 * 
		 */
		
		
		System.out.println(company==company1);  //true
		System.out.println(company.equals(company1)); //true
		
		System.out.println();
		System.out.println(myCompany==myCompany1); //false
		System.out.println(myCompany.equals(myCompany1));//true
		
	
	}

}
