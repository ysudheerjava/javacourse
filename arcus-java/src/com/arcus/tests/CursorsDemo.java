package com.arcus.tests;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vector = new Vector();
		vector.add("India");
		vector.add("US");
		vector.add("Aus");
		vector.add("UK");
		vector.add("UAE");
		vector.add("HK");
		vector.add("SG");
		
		for (int i =0; i<vector.size(); i++) {
			
			System.out.println(vector.get(i));
		}
		
		Enumeration<String> e = vector.elements();
		
		
		while(e.hasMoreElements()) {
			
			 String i = (String) e.nextElement();
			 System.out.println(i);
		
	}

	}
}
