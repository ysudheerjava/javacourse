package com.arcus.javatraining.strings;

public class MethodsEx {

	public void addNumbers() {

		int a = 10;
		int b = 12;
		int c = a+b;
		
		System.out.println("Sum "+ c);
	}

	public void addNumbers(int a, int b) {
		int sum = a+b;
		System.out.println("Sum " + sum);
	}
	
	public int addNumbers(int a, int b,int c) {
		int sum = a+b+c;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		MethodsEx me= new MethodsEx();
		//me.addNumbers();
		me.addNumbers(10,20);
		
		int sum = me.addNumbers(10, 20, 30);
		System.out.println(sum);
		

	}

}
