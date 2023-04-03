package com.arcus.javatraining.generics.training.one;

public class TestPrinter {

	public static void main(String[] args) {


		
		/*
		 * IntegerPrinter intPrinter = new IntegerPrinter(100); intPrinter.print();
		 * 
		 * StringPrinter stringPrinter = new StringPrinter("Arcus");
		 * stringPrinter.print();
		 * 
		 * DoublePrinter doublePrinter = new DoublePrinter(200.383);
		 * doublePrinter.print();
		 */
		 
		
		Printer<String> sPrinter = new Printer<String>("Arcus");
		sPrinter.print();
		
		Printer<Integer> iPrinter = new Printer<Integer>(200);
		iPrinter.print();
		
		Printer<Character> cPrinter = new Printer<Character>('x');
		cPrinter.print();
		
		Printer<Double> dPrinter = new Printer<Double>(300.999);
		dPrinter.print();
		
		Printer<Boolean> bPrinter = new Printer<Boolean>(true);
		bPrinter.print();
		
		
		

	}

}
