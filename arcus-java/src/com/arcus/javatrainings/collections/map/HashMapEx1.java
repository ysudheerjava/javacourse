package com.arcus.javatrainings.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "C");
		map.put(3, "SQL");
		map.put(4, "Python");

		System.out.println(map);

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(5, "VC++");
		map2.put(6, "Basic");
		map2.put(7, "cobol");
		map2.put(8, "Pascal");

		System.out.println(map2);

		map2.putAll(map);

		System.out.println("Merged Map" + map2);

		// keySet()

		Iterator<Integer> iter = map2.keySet().iterator();

		System.out.println("KeySet using while :::::::::");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("KeySet using for loop :::::::::");
		for (Integer key : map2.keySet()) {
			System.out.println(key);
		}

		// entrySet()

		System.out.println("Entryset using while :::::::::");

		Iterator<Map.Entry<Integer, String>> entrysetIter = map2.entrySet().iterator();

		while (entrysetIter.hasNext()) {
			System.out.println(entrysetIter.next());
		}

		System.out.println("Entryset using For :::::::::");

		for (Map.Entry<Integer, String> entryset : map2.entrySet()) {

			System.out.println(entryset);
		}

		for (Map.Entry<Integer, String> entryset : map2.entrySet()) {

			Integer key = entryset.getKey();// get the key from entry
			String value = entryset.getValue();// get the value from entry
			System.out.println(key + "->" + value);

		}

	}

}
