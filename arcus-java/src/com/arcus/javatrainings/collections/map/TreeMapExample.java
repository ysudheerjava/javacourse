package com.arcus.javatrainings.collections.map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(91, "India");
		treeMap.put(81, "Japan");
		treeMap.put(1, "US");
		treeMap.put(44, "UK");
		treeMap.put(61, "Australia");

		System.out.println(treeMap);

		Set s = treeMap.keySet(); //
		Collection col = treeMap.values();

		Set set = treeMap.entrySet();

	}

}
