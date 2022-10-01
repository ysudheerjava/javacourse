package com.arcus.javatrainings.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet treeset = new TreeSet();
		
		/*
		 * treeset.add("A"); //ascii val is 65
		 * 
		 * treeset.add("a"); // 97
		 * 
		 * treeset.add("B"); treeset.add("Z"); treeset.add("L");
		 */
		
	//	treeset.add(1);
		// treeset.add("A");
		 treeset.add(null);
		 
		//t.add(10);//Error: classCastException cannot compare differenet objects
		//t.add(null); // RE: Exception in thread "main" java.lang.NullPointerException
		///System.out.println(t); // [A, B, L, Z, a]
		  
		
		//System.out.println(treeset.toString());
	}
}