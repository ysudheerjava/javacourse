package com.arcus.javatrainings.collections.set;

import java.util.*;

class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h= new LinkedHashSet();
		
		h.add("C");
		h.add("B");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		
		
		System.out.println(h.add("Z")); // false
		System.out.println(h); // [null, D, B, C, 10, Z]
	}
}