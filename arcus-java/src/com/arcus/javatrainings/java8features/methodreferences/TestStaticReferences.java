package com.arcus.javatrainings.java8features.methodreferences;

public class TestStaticReferences {
	
	static void show(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestIface i = TestStaticReferences::show;
	    i.show(1);

	}

}
