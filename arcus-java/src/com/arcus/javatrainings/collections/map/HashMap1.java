package com.arcus.javatrainings.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		// put method to add key value pairs in hashmap

		hm.put(100, "Ram");
		hm.put(101, "Sam");
		hm.put(102, "Khan");

		System.out.println(hm);

		// Retrieval using enhanced for loop
		System.out.println("Retrieval using enhanced for loop");
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			Integer key = entry.getKey(); // to retrieve the key from entry
			String value = entry.getValue();// to retrieve the value of the entry
			System.out.println(key + "= " + value);
		}

		System.out.println("Retrieval using Iterator");
		//Set s = hm.keySet(); // key set
		Set s1 = hm.entrySet();// entry set
		Iterator it = s1.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> m1 = (Map.Entry<Integer, String>) it.next();
			System.out.println(m1.getKey() + "....." + m1.getValue());

		}

	}

}
