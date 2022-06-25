package com.arcus.javatraining.overloading.constructoroverloading;

public class Test {

	String empName;
	int empAge;

	Test(String empName, int age) {

		System.out.println("In first constructor");
		this.empName = empName;
		this.empAge = age;
	}

	Test(Test t) {
		System.out.println("In second constructor");
		empName = t.empName;
		empAge = t.empAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test1 = new Test("Sudheer", 20);

		System.out.println(test1.empName);
		System.out.println(test1.empAge);

		Test test2 = new Test(test1);
		
		System.out.println(test2.empName);
		System.out.println(test2.empAge);

	}

}
