package com.arcus.javatraining.strings;

public class StringDemo {

	public static void main(String[] args) {

		/*
		 * String myCompany = "Arcus"; String myCompany1 = "Arcus";
		 * 
		 * System.out.println(myCompany==myCompany1);
		 */

		String myCompany = new String("Arcus").intern();
		String myCompany1 = new String("Arcus");

		String x = "Arcus";

		System.out.println(myCompany == myCompany1);
		System.out.println(myCompany.equals(myCompany1));

		System.out.println(myCompany.toUpperCase());
		System.out.println(myCompany.charAt(0));

		System.out.println(myCompany == x);

	}

}
