package com.arcus.javatraining.generics.training;

public class TestPrinter {

	public static void main(String[] args) {
	
		
		  IntegerPrinter iPrinter = new IntegerPrinter(100);
		  iPrinter.print();
		  
		  DoublePrinter dPrinter = new DoublePrinter(200.43); 
		  dPrinter.print();
		 
		  StringPrinter sPrinter = new StringPrinter("Arcus");
		  sPrinter.print();
	
		
		
		
		
		
		
		
		
	}

}
