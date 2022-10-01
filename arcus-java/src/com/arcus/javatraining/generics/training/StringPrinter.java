package com.arcus.javatraining.generics.training;

public class StringPrinter {
	
	String thingToPrint;

	
	public StringPrinter(String thingToPrints) {
		this.thingToPrint = thingToPrints;
	}
	
	public void print() {
		
		System.out.println(thingToPrint);
	}

}
