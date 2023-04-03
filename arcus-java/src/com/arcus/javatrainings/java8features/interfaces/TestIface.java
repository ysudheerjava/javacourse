package com.arcus.javatrainings.java8features.interfaces;

public class TestIface implements MyInterface, MyInterface2 {

	public void show(int a, int b) {

		System.out.println(a + b);
		System.out.println(a - b);

	}

	public void show(int a, int b, int c) {

		System.out.println(a + b);
		System.out.println(a - b);

	}

	public int doAddition(int x, int y) {

		return 100;

		// return MyInterface2.super.doAddition(x, y);

	}

	public static void main(String args[]) {

		TestIface i = new TestIface();
		i.show(1, 0);
		i.doAddition(10, 20);

	}

}
