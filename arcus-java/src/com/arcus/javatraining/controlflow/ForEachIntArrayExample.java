package com.arcus.javatraining.controlflow;

public class ForEachIntArrayExample {
	public static void main(String args[]) {
		
		int[] myArray = {10,20,30,40};
		//List list = new ArrayList();
		//list.add(10);
		//list.add(20);
		//list.add(30);
		System.out.print("Elements of Array: "+"\n");
		for (int x : myArray) {
			System.out.print(x +"\n");
			//System.out.print(",");
		}
		
	}
}