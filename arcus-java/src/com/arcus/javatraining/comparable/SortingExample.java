package com.arcus.javatraining.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(400);
		al.add(4009);
		al.add(123);
		al.add(54);
		al.add(848);

		System.out.println("Before sorting integers: " + al);

		Collections.sort(al);

		System.out.println("After sorting integers: " + al);

		ArrayList<String> stringAL = new ArrayList<>();

		stringAL.add("US");
		stringAL.add("India");
		stringAL.add("Japan");
		stringAL.add("Australia");
		stringAL.add("Bhutan");

	System.out.println("Before sorting Strings: " + stringAL);

		Collections.sort(stringAL);

	System.out.println("After sorting Strings: " + stringAL);

	}

}
