package com.arcus.javatraining.interfaces;

@FunctionalInterface

interface Iface2 {
	public int asa();
	

	default void myMethod() {

		System.out.println("Default Method of interface");
	}
}