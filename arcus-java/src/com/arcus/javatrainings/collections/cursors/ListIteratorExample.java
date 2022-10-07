package com.arcus.javatrainings.collections.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {

			al.add(i);

		}
		System.out.println(al);
		
		ListIterator listitr = al.listIterator();
		
		while (listitr.hasNext()) {

			Integer i = (Integer) listitr.next();
			System.out.println(i);
			
			if (i == 10) {
				listitr.remove();
			}
			if (i == 3) {
				listitr.remove();
			}
		}

		System.out.println(al);

	}

}
