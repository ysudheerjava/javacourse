package com.arcus.javatrainings.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort_StringInteger {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("Guindy");
		l.add("Bombay");
		l.add(1);
		l.add(5);
		System.out.println(l);
		
		Collections.sort(l);// cannot compare a String with Integer, so java.lang.ClassCastException
		System.out.println(l);
		
		/*
		 * Exception in thread "main" java.lang.ClassCastException: java.lang.String
		 * cannot be cast to java.lang.Integer at
		 * java.lang.Integer.compareTo(Integer.java:52) at
		 * java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:
		 * 321) at java.util.ComparableTimSort.sort(ComparableTimSort.java:188) at
		 * java.util.Arrays.sort(Arrays.java:1312)
		 */
		

	}

}
