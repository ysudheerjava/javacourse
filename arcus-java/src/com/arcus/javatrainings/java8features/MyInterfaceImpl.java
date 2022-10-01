package com.arcus.javatrainings.java8features;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void show() {
		System.out.println("Hello!!");

	}

	public static void main(String[] args) {
		MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();

		// default method in interface
		System.out.println(myInterfaceImpl.doAddition(10, 20));

		MyInterface.displayText();

		myInterfaceImpl.show();

	}

}
