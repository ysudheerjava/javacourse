package com.arcus.practice;

import java.util.*;
import java.io.*;

class Main {

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
		try (// keep this function call here
				Scanner s = new Scanner(System.in)) {
			String[] strArr = s.nextLine().replaceAll("[ \"{}\\]\\[(new|String)]", "").split(",");

			/*
			 * for (String str : strArr) { System.out.println(str); }
			 */

			Map<String, Integer> map = SearchingChallenge(strArr);
			String result = "";
			for (String key : map.keySet()) {
				if (map.get(key) != 0) {
					if (result != "") {
						result += ",";
					}
				}
				result += key + ":" + map.get(key);
			}
			System.out.println(result);
			// new String[]{"A:22","D:3","C:4","A:-22"}
			// new String[]{"A:22","D:3","C:4","A:-22","B:0","C:0","X:-100","X:100"}
		}

	}

}