package com.arcus.javatrainings.collections.cursors;
// Java Program to traverse the list both in forward and
// backward direction using listIterator

import java.util.*;

public class ListIteratorExample1 {

	public static void main(String[] args)
	{
		// list of names
		List<String> names = new LinkedList<>();
		names.add("Arcus");
		names.add("Infotech");
		names.add("Hyderabad");

		// Getting ListIterator
		ListIterator<String> listIterator= names.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("=================================");
		// Traversing elements, the iterator is at the end
		// at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
