package com.arcus.javatraining.controlflow;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString ="Sudheer";
		
		char[] ch = ch= myString.toCharArray();
		
		System.out.println(myString.length());
		for(int i=myString.length()-1;i>=0; i--) {
			
			System.out.print(ch[i]);
		}
		
		
		 	System.out.println(2 + 0 + 1 + 6 + "Sudheer");
	        System.out.println("Sudheer" + 2 + 0 + 1 + 6);
	        System.out.println(2 + 0 + 1 + 5 + "Sudheer" + 2 + 0 + 1 + 6);
	        System.out.println(2 + 0 + 1 + 5 + "Sudheer" + (2 + 0 + 1 + 6));

	}

}
