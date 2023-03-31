package com.arcus.javatraining.interfaces.functional;

public class FunctionalInterfaceDemo {

	public static void main(String args[]) {

		Iface1 iface1;

		/*
		 * iface1 = (i, j) -> {System.out.println(i + j);
		 * System.out.println("Another statement");};
		 * 
		 * iface1.add(10, 30);
		 */

		iface1 = (i) -> i;

		String myText = iface1.getText("S");
		System.out.println(myText);
	}

}
