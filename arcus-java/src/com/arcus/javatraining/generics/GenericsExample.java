package com.arcus.javatraining.generics;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); //
		// ArrayList can be used to store heterogeneous objects
		al.add("Vijay");
		al.add("Sudheer");
		al.add("Khadeer");
		al.add("Zohaib");
		al.add("Sathish");
		
		
			/*
		 * al.add(1000); al.add(true);
		 */

		System.out.println(al.toString());

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		/*
		 * for(String name:al.toString()) { System.out.println(); }
		 */

	}

}
