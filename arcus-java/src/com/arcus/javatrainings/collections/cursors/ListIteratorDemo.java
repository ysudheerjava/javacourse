package com.arcus.javatrainings.collections.cursors;
// Java Program to Show the Usage of listIterator

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a list of names
		List<String> names = new LinkedList<>();
	
		names.add("Welcome");
		names.add("To");
		names.add("Gfg");

		// Getting ListIterator
		ListIterator<String> namesIterator
			= names.listIterator();

		// Traversing elements using next() method
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		// for-each loop creates Internal Iterator here.
		for (String s : names) {
			System.out.println(s);
		}
	}
}
