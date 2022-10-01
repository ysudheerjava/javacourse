package com.arcus.tests;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("India");
		al.add("US");
		al.add("Aus");
		al.add("UK");
		al.add("UAE");
		al.add("HK");
		al.add("SG");

		Iterator iter = al.iterator();

		while (iter.hasNext()) {

			String i = (String) iter.next();
			// System.out.println(i);
			if (i == "SG") {
				iter.remove();
			}

		}
		System.out.println(al);

	}

}
