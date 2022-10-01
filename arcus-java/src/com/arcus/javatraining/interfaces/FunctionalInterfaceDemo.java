package com.arcus.javatraining.interfaces;

public class FunctionalInterfaceDemo {

	public static void main(String args[]) {

		Iface1 iface1;

		iface1 = (i, j) -> {System.out.println(i + j);};
		iface1.add(10, 30);

	}

}
