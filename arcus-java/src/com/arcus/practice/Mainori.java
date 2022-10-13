package com.arcus.practice;

import java.util.*;
import java.io.*;

class Mainori {

	@SuppressWarnings("unchecked")
	public static Map SearchingChallenge(String[] strArr) {
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
		 * Iterator<?> it = map.entrySet().iterator(); while (it.hasNext()) {
		 * Entry<String, Integer> entry = (Entry<String, Integer>) it.next(); if
		 * (entry.getValue().equals(0)) { it.remove(); }
		 * 
		 * }
		 */

		for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			if (entry.getValue().equals(0)) {
				it.remove();
			}
		}

		return map;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// keep this function call here
		// Scanner s = new Scanner(System.in);
		// System.out.print(SearchingChallenge(s.nextLine()));
		String strArr[] = { "X:-1", "Y:1", "X:-4", "B:3", "X:5" };
		Map<String, Integer> map = SearchingChallenge(strArr);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

}