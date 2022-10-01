package com.arcus.javatrainings.collections.map;

import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Ram");
		hm.put(2, "Rahim");
		hm.put(3, "Robert");

		System.out.println(hm.put(1, "Rajan"));

		System.out.println(hm);

		// keySet();
		Set s = hm.keySet();

		System.out.println(s);

		// values
		Collection c = hm.values();
		System.out.println(c);

		// EntrySet

		Set entrySet = hm.entrySet();
		System.out.println(entrySet);

		Iterator iter = entrySet.iterator();

		while (iter.hasNext()) {

			Map.Entry mapentry = (Map.Entry) iter.next();

			// System.out.println(mapentry.getKey());
			System.out.println(mapentry.getValue());

		}

		HashMap<Integer, String> hm2 = new HashMap<>();

		hm2.put(1, "Arcus");
		hm2.put(2, "Dhanush");
		hm2.put(3, "Sreeni");

		// hm.merge(hm2);

		System.out.println("Using enhanced For Loop");
		for (Map.Entry entry : hm.entrySet()) {

			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();

			System.out.println(key + "=" + value);

		}

	}
}