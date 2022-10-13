package com.arcus.javatrainings.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String args[]) {

		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(40, "Hyderabad");
		hMap.put(80, "Bangalore");
		hMap.put(22, "Mumbai");
		hMap.put(44, "Chennai");
		hMap.put(44, "Chennai");

		// keys
		for (Integer key : hMap.keySet()) {
			System.out.print(key + " ");

		}

		// values
		System.out.println(hMap.values());

		//

		Set<?> set = hMap.entrySet();
		System.out.println(set);

		Iterator<?> itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer,String> m = (Map.Entry<Integer,String>) itr.next();
			System.out.println(m.getKey() + "|" + m.getValue());
			if (m.getKey().equals(44)) {
				m.setValue("CH");
			}
		}

	}

}
