package com.arcus.javatrainings.collections.set;

import java.util.*;

class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());// 1
		t.add(10);
		t.add(0); // compare(0,10); //1
		t.add(15); // compare(15,10); //-1
		t.add(5);// compare(5,15);// +ve
		//compare(5,10); +1
//compare(5,0); -1
		t.add(20); // compare(20,15); -1
		t.add(20); // compare(20,20); 0
		System.out.println(t);// [20, 15, 10, 5, 0]
	}
}


class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;
	}
}