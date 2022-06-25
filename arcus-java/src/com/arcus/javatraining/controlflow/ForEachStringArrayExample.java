package com.arcus.javatraining.controlflow;

public class ForEachStringArrayExample {
	public static void main(String args[]) {
		
		int[] myArray = {10,20,30,40};
		//List list = new ArrayList();
		//list.add(10);
		//list.add(20);
		//list.add(30);
		System.out.print("Elements of Array= ");
	
		String[] names = { "abc", "xyz", "test", "example" };
		System.out.println("String Array value = ");
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}
}