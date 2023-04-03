package com.arcus.javatrainings.collections.list;

public class IntegerPrinter {
	
	Integer thingToPrint;
	static int mystaticvar=10;
	
	public IntegerPrinter(Integer thingToPrint) {
		this.thingToPrint= thingToPrint;
	}
	
	public void print() {
	System.out.println(mystaticvar);
		System.out.println(thingToPrint);
	}
	
	
	
}
