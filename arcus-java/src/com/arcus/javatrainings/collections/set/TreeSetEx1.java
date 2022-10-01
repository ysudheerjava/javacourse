package com.arcus.javatrainings.collections.set;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String args[]) {

		TreeSet t = new TreeSet();// 1
		t.add(10);
		t.add(0); // compare(0,10); //1
		t.add(15); // compare(15,10); //-1
		t.add(5);// compare(5,15);// +ve
		// compare(5,10); +1
		// compare(5,0); -1
		t.add(20); // compare(20,15); -1
		t.add(20); // compare(20,20); 0

		System.out.println(t);// [20, 15, 10, 5, 0]

		TreeSet t1 = new TreeSet();
		t1.add("Delhi");
		t1.add("Hyderabad");
		t1.add("Chennai");
		t1.add("Amritsar");
		t1.add("Bombay");
		System.out.println(t1);
		
		/*
		 * for(int i =0; i<t1.size();i++) {
		 * 
		 * }
		 */
		
		

	}

}
