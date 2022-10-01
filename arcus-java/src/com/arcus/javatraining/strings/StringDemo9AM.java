package com.arcus.javatraining.strings;

public class StringDemo9AM {
	
	

	public static void main(String[] args) {

		String myCompanyName1 = "Arcus";

		String myCompanyName2 = "Private Ltd.";

		String myFullCompanyName = myCompanyName1 + myCompanyName2;

		System.out.println(myCompanyName1.concat(myFullCompanyName));

		System.out.println(myCompanyName1.concat(myFullCompanyName));

		System.out.println("My Company Name: " + myFullCompanyName);

		System.out.println(myFullCompanyName.endsWith("."));

		System.out.println(myFullCompanyName.startsWith("I"));

		System.out.println(myFullCompanyName.startsWith("A"));

		System.out.println(myFullCompanyName.equalsIgnoreCase("arcusPrivate Ltd."));// ArcusPrivate Ltd.

		System.out.println(myFullCompanyName.length());

		System.out.println(myFullCompanyName.isEmpty());

		System.out.println(myFullCompanyName.substring(3));

		String myString = "Hello";// 123456

		myString = myString.concat("World"); // 2939494

		System.out.println(myString);

		StringBuffer strbuff = new StringBuffer("Hello");
		strbuff.append("World");

		System.out.println(strbuff);

		StringBuilder strbuilder = new StringBuilder("Hello");
		strbuilder.append("World");

		System.out.println(strbuilder.reverse());

	}

}
