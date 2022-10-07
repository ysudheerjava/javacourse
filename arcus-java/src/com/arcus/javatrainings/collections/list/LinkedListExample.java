package com.arcus.javatrainings.collections.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Aarcus");
		ll.add(null);

		System.out.println(ll);

		ll.set(1, "Infotech");
		System.out.println(ll);

		ll.add(1, "Hyderabad");
		System.out.println(ll);

		ll.removeLast();
		System.out.println(ll);

		ll.addFirst("Chennai");
		System.out.println(ll);

		// ll.set()

	}

}
