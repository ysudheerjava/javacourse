package com.arcus.tests;

import java.util.*;

public class Exercise13 {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");

		/*
		 * for (String e : c1) if(c2.contains(e)) { System.out.println(e+" Y"); }else {
		 * System.out.println(e+" N");}
		 */

		Iterator<String> it = c1.iterator();
		while (it.hasNext()) {
			String s=it.next();
			if(c2.contains(s)) {
				System.out.println(s+" Y");
			}else System.out.println(s+" N");
		}

		/*
		 * Red Y Green Y Black Y White N Pink Y
		 */

	}
}