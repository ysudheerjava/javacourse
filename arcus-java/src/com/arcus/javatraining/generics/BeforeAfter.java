package com.arcus.javatraining.generics;

import java.util.ArrayList;
import java.util.List;

public class BeforeAfter {

	public static void main(String args[]) {

		// Before Generics
		List list = new ArrayList();
		list.add("India");  //upcasting to Object type
		String s = (String) list.get(0); //Downcasting to String type
		
		
		

		// After Generics, typecasting of the object is not required
		List<String> genericList = new ArrayList<String>();
		genericList.add("hello");
		String str = genericList.get(0);
	}

}
