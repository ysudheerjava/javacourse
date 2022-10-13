package com.arcus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TreeMapExample_original {
	public static Map<String, Integer> GroupTotals(String[] strArr) {
		/*
		 * Map<String, Integer> map = Collections
		 * .synchronizedMap(Collections.synchronizedMap(new TreeMap<String,
		 * Integer>()));
		 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : strArr) {
			StringTokenizer st = new StringTokenizer(str, ":");
			while (st.hasMoreTokens()) {
				String key = st.nextToken();
				Integer value = Integer.parseInt(st.nextToken());
				if (map.isEmpty()) {
					map.put(key, value);
				} else if (map.containsKey(key)) {
					for (Map.Entry<String, Integer> m : map.entrySet()) {
						if (m.getKey().equals(key)) {
							int val = 0;
							val = (int) m.getValue() + value;
							m.setValue(val);
						}
					}

				} else
					map.put(key, value);
			}
		}

		/*
		 * for (Map.Entry<String, Integer> m : map.entrySet()) { if
		 * (m.getValue().equals(0)) { map.remove(m.getKey()); } }
		 */

		for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			if (entry.getValue().equals(0)) {
				it.remove();
			}
		}

		/*
		 * Iterator it = map.entrySet().iterator(); while (it.hasNext()) { Entry item =
		 * (Entry) it.next(); if (item.getValue().equals(0)) { it.remove(); } //
		 * it.remove(); }
		 */

		return map;
	}

	public static void main(String[] args) {
		String strArr[] = { "Y:-9", "D:33", "X:-3", "Y:1", "X:-4", "B:3", "X:5", "X:4", "E:1", "N:0", "D:-33" };
		Map<String, Integer> map = GroupTotals(strArr);
		System.out.println("Final Result: ");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

}
