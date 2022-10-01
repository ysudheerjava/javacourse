package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList();

		arrayList.add("Sudheer");
		arrayList.add("Ram");
		

		System.out.println("Size of the ArrayList: " + arrayList.size());

		System.out.println("Using toString() method: "+arrayList.toString());
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}

		for (String a : arrayList) {
			System.out.println(a);
		}
		
		
		// ArrayList al = new ArrayList(100);

	}

}
