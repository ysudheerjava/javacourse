package com.arcus.javatrainings.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
	
		t1.add(null); // RE: Exception in thread "main" java.lang.NullPointerException
		///System.out.println(t); // [A, B, L, Z, a]
		
		System.out.println(t1.toString());
	}

}
