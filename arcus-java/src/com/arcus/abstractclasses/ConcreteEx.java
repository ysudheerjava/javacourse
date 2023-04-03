package com.arcus.abstractclasses;

public class ConcreteEx extends AbstractDemo {

	public void displayText() {
		System.out.println("Overriding abstract method");
	}

	public static void main(String args[]) {
		ConcreteEx obj = new ConcreteEx();
		obj.displayText();
	}

}