package com.arcus.javatraining.interfaces.functional;

public class InterfaceImpl implements InterfaceDemo {

	public void displayText1() {
		System.out.println("Java 8 interfaces");
	}

	public void displayText2() {
		System.out.println("Java 8 interfaces Demo");
	}

	public static void main(String[] args) {

		InterfaceImpl impl = new InterfaceImpl();
		impl.displayText1();
		impl.displayText2();

		// calling default methods from interface
		impl.doSomething1();
		impl.doSomething2();

		// calling static methods from interface
		InterfaceDemo.doSomethingElse1();
		InterfaceDemo.doSomethingElse1();

	}

	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
