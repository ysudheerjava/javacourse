package com.accenture;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		String myString = "How are you";
		String myAnotherString = "Where are you";

		ArrayList al = new ArrayList();
		ArrayList a2 = new ArrayList();

		StringTokenizer myString1 = new StringTokenizer(myString, " ");

		while (myString1.hasMoreTokens()) {
			for (int i = 0; i < myString1.countTokens(); i++) {
				al.add(myString1.nextToken());

			}

		}
		
		System.out.println(al);

		StringTokenizer myString2 = new StringTokenizer(myAnotherString, " ");

		while (myString2.hasMoreTokens()) {
			for (int i = 0; i < myString2.countTokens(); i++) {
				a2.add(myString2.nextToken());

			}

		}
		
		System.out.println(a2);

		String mynewstring = "";

		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < al.size(); j++) {
			  if (al.get(i).equals(a2.get(j))) {
				  mynewstring = mynewstring + al.get(i)+" "; 
				 

				  }
			  }
			}
		
		
		 System.out.println(mynewstring);

	}

}
