package com.arcus.javatraining.interfaces;

class Hello implements VariableTestIface1, VariableTestIface2 {
	public static void Main(String arg[]) {
//System.out.println(x); // reference to x is ambiguous both variables are x
		System.out.println(VariableTestIface1.x);
		System.out.println(VariableTestIface2.x);
	}
}