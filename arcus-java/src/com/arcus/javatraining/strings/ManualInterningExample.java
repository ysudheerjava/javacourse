package com.arcus.javatraining.strings;

public class ManualInterningExample {
	public static void main(String args[]) {

		String constantString = "interned Sudheer";
		String newString = new String("interned Sudheer");

		System.out.println(constantString == newString);

		String internedString = newString.intern();

		System.out.println(constantString == internedString);
	}

}
