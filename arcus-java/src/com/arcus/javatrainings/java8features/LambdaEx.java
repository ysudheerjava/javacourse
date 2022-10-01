package com.arcus.javatrainings.java8features;
public class LambdaEx {

	public void doSomething() {
		System.out.println("Arcus");
	}
	
	

	public static void main(String[] args) {

		Interf1 f1;
		
		
		f1 = (i, j) -> i + j;
		System.out.println(f1.m1(10, 20));

		Interf2 f2;
		f2 = () -> System.out.println("Hello Lambda");

		f2.m1();

		Interf3 f3;
		f3 = (i, j) -> System.out.println(i + j);
		f3.m1(10, 20);
		
		
		

	}

}
