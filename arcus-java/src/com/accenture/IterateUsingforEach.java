package com.accenture;
// Java Program to demonstrate iterate

// an Iterable using forEach method

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class IterateUsingforEach {
	public static void main(String[] args) {
		// create a list
		List<String> list = new ArrayList<>();

		// add elements to the list
		list.add("Arcus");
		list.add("Info");
		list.add("Tech");

		// Iterate through the list
		list.forEach((str) -> {
			System.out.println(str);
		});

		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");

		namesMap.forEach((key, value) -> System.out.println(key + " " + value));

		// another way to iterate using entrySet
		namesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}
}
