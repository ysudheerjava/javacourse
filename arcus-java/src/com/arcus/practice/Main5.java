package com.arcus.practice;

import java.util.*;
import java.io.*;

class Main5 {

	@SuppressWarnings("unchecked")

	public static Map SearchingChallenge(String strArr) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		ArrayList al = new ArrayList();
		StringTokenizer st = new StringTokenizer(strArr, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			al.add(token);
		}
		Object[] objArr = al.toArray();
		String[] strArrNew = Arrays.stream(objArr).toArray(String[]::new);

		for (String str : strArrNew) {
			StringTokenizer stoken = new StringTokenizer(str, ":");
			while (stoken.hasMoreTokens()) {
				String key = stoken.nextToken();
				Integer value = Integer.parseInt(stoken.nextToken());
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
		// keep this function call here
		Scanner s = new Scanner(System.in);

		Map<String, Integer> map = SearchingChallenge(s.nextLine());

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

	}

}