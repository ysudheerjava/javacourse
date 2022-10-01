package com.arcus.javatraining.comparator;

public class TestConstructor {
	
	int j;
	int k;
	
	TestConstructor(int j1, int k){
		j=j1;
		this.k=k;
	}
	
	public static void main(String args[]) {
		
		TestConstructor tc = new TestConstructor(19,29);
		System.out.println(tc.j);
		
		
	}

}
