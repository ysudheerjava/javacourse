package com.arcus.javatrainings.collections.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {

			al.add(i);

		}
		System.out.println(al);
		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			Integer i = (Integer) iter.next();
			System.out.println(i);

			if (i % 2 == 0)
				System.out.println(i);
			else
				iter.remove();
		}
		System.out.println(al);

	}

}
