package com.arcus.abstractclasses;

abstract class AbstractDemo {
	public void concreteMethod() {
		System.out.println("Concrete method of abstract class");
	}

	abstract public void displayText();
}

class ConcreteEx extends AbstractDemo {

	public void displayText() {
		System.out.println("Overriding abstract method");
	}

	public static void main(String args[]) {
		ConcreteEx obj = new ConcreteEx();
		obj.displayText();
	}

}
