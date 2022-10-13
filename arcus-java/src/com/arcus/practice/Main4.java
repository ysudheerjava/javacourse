package com.arcus.practice;

import java.util.*;
import java.io.*;

class Main4 {

	@SuppressWarnings("unchecked")
	public static Map SearchingChallenge(String[] strArr) {
		Map<String, Integer> map = new TreeMap<String, Integer>();

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

		// String[] objectArray = (String[]) map.entrySet().toArray();
		return map;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// keep this function call here
		/*
		 * Scanner s = new Scanner(System.in); //
		 * System.out.print(SearchingChallenge(s.nextLine()));
		 * 
		 * ArrayList al = new ArrayList(); //s.useDelimiter(","); String mytext=
		 * s.nextLine(); //System.out.println(mytext);
		 */
		
		/*
		 * StringTokenizer st = new StringTokenizer(mytext, ","); while
		 * (st.hasMoreTokens()) { String token = st.nextToken(); al.add(token); }
		 */
		
	
		
		//Object[] objArr=al.toArray();
		//String[] strArr = Arrays.stream(objArr).toArray(String[]::new);
		
		/*
		 * for (String j:strArr ) { System.out.println(j); }
		 */
		String strArr[] = { "X:-1", "Y:1", "X:-4", "B:3", "X:5" };
		//String strArr[] = {"Z:0", "A:-1"};
		
		  Map<String, Integer> map = SearchingChallenge(strArr);
		  
			/*
			 * for (Map.Entry<String, Integer> m : map.entrySet()) {
			 * 
			 * System.out.print(m.getKey() + ":" + m.getValue()); if(map.entrySet()!=null) {
			 * System.out.print(",");
			 * 
			 * }}
			 */
		  
		  String result= "";
		  for(String key: map.keySet()) {
			  
			  if (map.get(key)!=0) {
				 if(result != "") {
				 result+=",";
				 }
			  }
			  
			  result+=key+":"+map.get(key);
		  }
		 System.out.println(result);
		
		
		
	}

}