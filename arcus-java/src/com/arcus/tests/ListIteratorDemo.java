package com.arcus.tests;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	
		List states = new LinkedList();
		
		states.add("Telangana");
		states.add("Tamilnadu");
		states.add("Andhra Pradesh");
		states.add("Karnataka");
		states.add("Kerala");
		states.add("Punjab");
		
		System.out.println(states);
		
		ListIterator listIter = states.listIterator();
		
		while(listIter.hasNext()) {
			String str= (String) listIter.next();
			if(str.equals("Punjab")) 
			listIter.remove();
			if (str.equals("Kerala"))
				listIter.add("Goa");
	
			
		}
		System.out.println(states);
		

		
	}

}
