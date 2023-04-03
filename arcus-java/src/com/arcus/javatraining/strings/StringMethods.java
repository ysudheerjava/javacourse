package com.arcus.javatraining.strings;

public class StringMethods {

	public static void main(String[] args) {

		// different methods provided by String class

				String wish = "Wish you happy birthday";

				System.out.println(wish.charAt(0));

				boolean result = wish.endsWith("birthday");

				System.out.println(result);

				// boolean result2 = firstString.startsWith("Fir");

				// System.out.println(firstString.length());

				String myString = "Sudheer";
				String myString2 = new String("Sudheer");

				System.out.println(myString.length());

				System.out.println(myString.isEmpty());

				System.out.println(myString == myString2);

				System.out.println(myString.equals(myString2));
				
				
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

				// newString.concat("Arcus");

	}

}
