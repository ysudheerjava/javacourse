package com.arcus.javatrainings.collections.set;

import java.util.*;

class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		//HashSet h1 = new HashSet(20);
		
		HashSet<String> hs = new HashSet<String>(20,0.75F);
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		h.add("Arcus");
		h.add("B");	
		System.out.println(h.add("Z"));
		
		
		
		System.out.println(h);
		
		
		
		//System.out.println(h.add("Z")); // false
	//	System.out.println(h); // [null, D, B, C, 10, Z]
	}
}