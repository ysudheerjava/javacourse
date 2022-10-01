package com.arcus.javatrainings.java8features.mytest;

public class TestLambdaDemo {

	public static void main(String[] args) {

		TestIface t;
		// t= new TestIfaceImpl();

		/*
		 * t = new TestIface() {
		 * 
		 * @Override public void show() { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * };
		 */
		
		//TestLambdaDemo$1.class
		
		
		t= k->{System.out.println("Hello"+k);
		};
		
		t.show(20);
		t.show1();

	}
}
