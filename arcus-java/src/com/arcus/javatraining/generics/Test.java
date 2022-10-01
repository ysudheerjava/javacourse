package com.arcus.javatraining.generics;
// Java program to show working of user defined

// Generic classes

// We use < > to specify Parameter type
public class Test<M> {
	// An object of type T is declared
	M obj;

	Test() {
	}

	Test(M obj) {
		this.obj = obj;
	} // constructor initializing obj

	public M getObject() {
		return this.obj;
	}
}
