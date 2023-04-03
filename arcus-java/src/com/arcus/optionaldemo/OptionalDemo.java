package com.arcus.optionaldemo;

public class OptionalDemo {

	public static void main(String args[]) {

		String[] arr = new String[5];
		arr[1] = "Arcus";
		arr[2] = "Infotech";
		System.out.println(arr[1]);
		System.out.println(arr[3].toUpperCase());// Any operation performed on null value, will result in
													// NullPointerException.

	}

}
