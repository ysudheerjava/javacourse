package com.arcus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class TestTree {

	@SuppressWarnings("unchecked")
	public static Map<String, Integer> GroupTotals(String[] strArr) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : strArr) {
			StringTokenizer st = new StringTokenizer(str, ":");//Y:10
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

		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			if (entry.getValue().equals(0)) {
				it.remove();
			}
			
		}
		return map;
	}

	public static void main(String[] args) {
		String strArr[] = { "Y:-9", "D:33", "X:-3", "Y:1", "X:-4", "B:3", "X:5", "G:1","G:30","G:-31","X:4", "E:1", "N:0", "D:-33"};
		
		//String strArr[] = { "X:-1","Y:1","X:-4","B:3","X:5" };
		Map<String, Integer> map = GroupTotals(strArr);
		System.out.println("Final Result: ");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

}
