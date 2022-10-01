package com.arcus.javatrainings.collections.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {

		Vector vector = new Vector();

		for (int i = 1; i <= 10; i++) {
			vector.addElement(i);
		}

		Enumeration en = vector.elements();

		while (en.hasMoreElements()) {
			Integer I = (Integer) en.nextElement();
			System.out.println(I);
		}

	}

}
