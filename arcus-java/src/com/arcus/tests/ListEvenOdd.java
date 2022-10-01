package com.arcus.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListEvenOdd {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		for(int i =1; i<=10; i++ ) {
			myList.add(i);
		}
		
		Iterator<Integer> itr = myList.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			
			if(num % 2==0) {
				System.out.println(num+ " is even" );
			}else 
				System.out.println(num + " is odd");
		}

	}

}
