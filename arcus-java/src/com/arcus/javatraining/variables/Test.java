package com.arcus.javatraining.variables;

class Test {

	boolean b; // instance
	int a; // instance
	String str; // instance
	float f;// instance
	char c;// instance

	static int x; // static
	static String y; // static

	public void doAdd() {
		int i = 10; // local variable
		int j = 20;
		int result = i + j;
		System.out.println(result);
	}

	public void doMultiplication() {

		int m = 20;
		int n = 20;

		int result = m * n;

		System.out.println(result);

	}

	public void doSubtraction() {

		int a = 10;
		int b = 20;

		int result = b - a;
		System.out.println(result);
	}

	public static void main(String[] args) {

		// Create an object of class Test
		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1.b);// false
		System.out.println(t1.a);
		System.out.println(t1.str);
		System.out.println(t1.f);

		System.out.println(t2.c);
	}

}
