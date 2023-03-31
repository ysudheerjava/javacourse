package com.arcus.javatraining.interfaces.functional;

@FunctionalInterface

interface Iface2 {
	public int asa();
	

	default void myMethod() {

		System.out.println("Default Method of interface");
	}
}