package com.arcus.javatrainings.collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsExample {

	public static void main(String[] args) {

		Vector vector = new Vector();

		for (int i = 1; i <= 5; i++) {

			vector.addElement(i);
		}

		System.out.println(vector);
		Enumeration en = vector.elements();

		while (en.hasMoreElements()) {

			Integer i = (Integer) en.nextElement();
			System.out.println(i);
		}

	}

}
