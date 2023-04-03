package com.arcus.javatrainings.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("G");
		
		System.out.println(hs.add("D"));
		
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
			

	}

}
