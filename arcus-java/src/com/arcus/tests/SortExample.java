package com.arcus.tests;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(100);
		al.add(50);
		al.add(180);
		al.add(5);
		al.add(90);
		al.add(10);

		ArrayList alStrings = new ArrayList();

		alStrings.add("India");
		alStrings.add("US");
		alStrings.add("Japan");
		alStrings.add("Australia");
		alStrings.add("Mexico");
		alStrings.add("Singapore");

		System.out.println("Before sorting numbers list" + al);

		Collections.sort(al);

		System.out.println("After sorting  numbers list" + al);
		
		
		System.out.println("Before sorting Strings list" + alStrings);
		Collections.sort(alStrings);
		
		System.out.println("After sorting Strings list" + alStrings);
		

	}

}
