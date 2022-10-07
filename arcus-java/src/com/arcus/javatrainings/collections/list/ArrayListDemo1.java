package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Arcus");
		/*
		 * al.add(100); al.add(true);
		 */

		al.add(" Private");
		al.add(" Limited");
		al.add(" Limited");
		al.add(null);

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		System.out.println();
		
		for (String str : al) {
			System.out.println(str);
		}
		
		System.out.println(al.size());
		
		ArrayList myList = new ArrayList(30);
		//(current capacity*3/2)+1.
		
		

	}

}
