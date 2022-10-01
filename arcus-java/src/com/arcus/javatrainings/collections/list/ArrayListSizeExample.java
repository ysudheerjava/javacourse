package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;

public class ArrayListSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.size());
		for (int i=0; i<10; i++) {
			al.add(al);
			
		}
		System.out.println(al.size());
		al.add(11);
		System.out.println(al.size());
		System.out.println(al.toString());
		al.remove(0);
		
		
		
		
	
		
		
		

	}

}
