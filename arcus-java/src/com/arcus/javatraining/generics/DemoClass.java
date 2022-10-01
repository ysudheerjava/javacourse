package com.arcus.javatraining.generics;

class DemoClass {

	// creae a generics method

	public <T extends Number> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data Passed: " + data);
	}

}