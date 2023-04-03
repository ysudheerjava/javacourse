package com.arcus.abstractclasses;

public class T1 {

	static int a = 10;
	int x = 30;

	protected void dosomething() {
		System.out.println("Hello");
	}

	static void dosomething1() {

		System.out.println("a1=" + a);
		a = 40;
	}

	static void do1() {

		System.out.println("a2=" + a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = 20;
		dosomething1();
		do1();

	}

}
