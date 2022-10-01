package com.arcus.javatrainings.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {

		HashMap hm = new HashMap();

		hm.put(100, "Sudheer");// key value pair
		hm.put(200, "Raj");
		hm.put(300, "Srini");
		hm.put(400, "Baber");

		// System.out.println(hm);

		hm.put(100, "Vinod");
		System.out.println(hm.put(100, "Harish"));

		Set s = hm.keySet(); //
		System.out.println(s);

		Collection col = hm.values();
		System.out.println(col);

		Set set = hm.entrySet();
		System.out.println(set);

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.println(m.getKey() + "|" + m.getValue());
			if (m.getKey().equals(300)) {
				m.setValue("Arcus");
			}
		}
		System.out.println(hm);

	}

}
