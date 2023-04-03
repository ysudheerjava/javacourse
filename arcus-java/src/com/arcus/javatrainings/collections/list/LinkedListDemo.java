package com.arcus.javatrainings.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String arg[]) {

		LinkedList<String> countriesList = new LinkedList();

		countriesList.add("India");
		countriesList.add("US");
		countriesList.add("Japan");
		countriesList.add("UK");

		for (int i = 0; i < countriesList.size(); i++) {
			System.out.println(countriesList.get(i));
		}

		System.out.println(countriesList);

		countriesList.set(1, "China");

		for (String country : countriesList) {
			System.out.println(country);
		}

		countriesList.addFirst("Russia");
		countriesList.addLast("Srilanka");

		for (String country : countriesList) {
			System.out.println(country);
		}

		countriesList.removeFirst();

		for (String country : countriesList) {
			System.out.println(country);
		}

		//
		

	}

}