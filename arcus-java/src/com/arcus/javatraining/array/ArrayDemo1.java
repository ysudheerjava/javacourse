package com.arcus.javatraining.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		String[] pledgeLine = new String[4];

		pledgeLine[0] = "India";
		pledgeLine[1] = "is";
		pledgeLine[2] = "my";
		pledgeLine[3] = "country";

		System.out.println("Normal for loop:::::::::::::::::");
		for (int i = 0; i < pledgeLine.length; i++) {
			System.out.print(pledgeLine[i] + " ");
		}
		System.out.println();

		System.out.println("Enhanced for loop:::::::::::::::::");
		for (String str : pledgeLine) {
			System.out.print(str + " ");
		}

	}

}
