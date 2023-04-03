package com.arcus.javatraining.strings;

public class TestString {

	public static void main(String[] args) {

		String myString = "Arcus";
		String myString1 = "Ameerpet";

		System.out.println(myString); // Arcus
		String anotherString = myString.concat("Info");
		System.out.println(anotherString); // ArcusInfo

		System.out.println(myString.length());

		System.out.println(myString.charAt(0));

		System.out.println(myString.isEmpty());

		System.out.println(myString.equals(anotherString));

		System.out.println(myString == anotherString);

		System.out.println(myString.endsWith("."));
		System.out.println(myString.startsWith("A"));
		System.out.println(myString.substring(2));

		StringBuilder str = new StringBuilder("Sudheer");
		str.append("Infotech");

		System.out.println(str);
		System.out.println(str.reverse());

	}

}
