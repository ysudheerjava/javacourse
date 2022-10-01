package com.arcus.javatraining.generics;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String args[]) {
		
		ArrayList strList1 = new ArrayList();
		strList1.add("aRCUW");
		strList1.add(234);
		strList1.add(33.44);
		
		ArrayList<String> strList = new ArrayList();
		
		strList.add("aRC");
		//strList.add(123);
		
		ArrayList<Integer> intList = new ArrayList();
		//intList.add("sudherr");
		intList.add(123);
		
	}

}
