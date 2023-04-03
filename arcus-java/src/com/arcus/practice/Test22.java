package com.arcus.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Test22 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(22);
		al.add(23);

		al.add("s");

		al.add("dfdf");

		for (Iterator it = al.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

}
