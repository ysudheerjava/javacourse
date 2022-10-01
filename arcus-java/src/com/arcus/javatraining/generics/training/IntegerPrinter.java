package com.arcus.javatraining.generics.training;

public class IntegerPrinter {
	
	Integer thingToPrint;

	
	public IntegerPrinter(Integer thingToPrints) {
		this.thingToPrint = thingToPrints;
	}
	
	public void print() {
		
		System.out.println(thingToPrint);
	}

}
