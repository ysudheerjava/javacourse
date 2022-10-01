package com.arcus.javatrainings.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String args[]) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(100, "Sudheer");// key value pair
		linkedHashMap.put(200, "Raj");
		linkedHashMap.put(300, "Srini");
		linkedHashMap.put(400, "Baber");

		// System.out.println(linkedHashMap);

		linkedHashMap.put(100, "Vinod");
		System.out.println(linkedHashMap.put(100, "Harish"));

		Set<Integer> s = linkedHashMap.keySet(); //
		System.out.println(s);

		Collection<String> col = linkedHashMap.values();
		System.out.println(col);

		Set<?> set = linkedHashMap.entrySet();
		System.out.println(set);

		Iterator<?> itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + "|" + m.getValue());
			if (m.getKey().equals(300)) {
				m.setValue("Arcus");
			}
		}
		System.out.println(linkedHashMap);

	}

}
