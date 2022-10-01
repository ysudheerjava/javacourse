package com.arcus.javatraining.array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dd = new int[2][2];
		
	System.out.println(dd.length);
	 int[] x = {10,20,30,40};
	
	for (int i=0; i<dd.length; i++) {
		for(int j=0; j<dd.length;j++) {
			dd[i][j]= x[i];
		}
	}
	
	for (int i=0; i<dd.length; i++) {
		for(int j=0; j<dd[i].length;j++) {
	
			System.out.println(dd[i][j]);
		}
	}
	
	
	}}
