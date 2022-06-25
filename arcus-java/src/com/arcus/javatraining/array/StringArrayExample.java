package com.arcus.javatraining.array;

public class StringArrayExample {

	
	public static void assignValuetoArrayElement(String a[]){
		System.out.println(a[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[10];
		
		names[0] = "A";
		names[1] = "ABC";
		names[2] = "XYZ";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		assignValuetoArrayElement(names);
	//	System.out.println(names[1]);
		
		//this line should throw an exception
		//System.out.println(names[6]);

	}

}
