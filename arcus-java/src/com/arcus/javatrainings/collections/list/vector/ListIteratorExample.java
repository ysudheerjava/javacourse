package com.arcus.javatrainings.collections.list.vector;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Modi");
		ll.add("Babu");
		ll.add("Jagan");
		ll.add("Stalin");
		ll.add("Shahrukh");
		System.out.println(ll);

		ListIterator<String> ltr = ll.listIterator();
		while (ltr.hasNext()) {
			String person = ltr.next();

			if (person.equals("Shahrukh"))
				ltr.remove();
			if (person.equals("Babu"))
				ltr.add("Lokesh");
			System.out.println(ll);

		}
		
		for(String element:ll){
			System.out.println(element);
		}
	}

}
