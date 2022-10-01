package com.arcus.javatraining.generics.training;

public class TestPrinter {

	public static void main(String[] args) {
	
		IntegerPrinter printer = new IntegerPrinter(100);
		printer.print();
		
		DoublePrinter dPrinter = new DoublePrinter(200.43);
		dPrinter.print();
		
		StringPrinter sPrinter = new StringPrinter("Arcus");
		sPrinter.print();
		
		
		
		
		
		
		
		
	}

}
