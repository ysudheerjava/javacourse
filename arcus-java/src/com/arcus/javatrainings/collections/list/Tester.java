package com.arcus.javatrainings.collections.list;

public class Tester {

	public static void main(String[] args) {

		/*
		 * IntegerPrinter intPrinter = new IntegerPrinter(100); intPrinter.print();
		 * 
		 * 
		 * StringPrinter stringPrinter = new StringPrinter("JAVA");
		 * stringPrinter.print();
		 */
		
		
		GenericPrinter<String> sPrinter = new GenericPrinter<>("arcus");
		sPrinter.print();
		
		GenericPrinter<Integer> iPrinter = new GenericPrinter<>(100);
		iPrinter.print();
		
		GenericPrinter<Double> dPrinter = new GenericPrinter<>(22.88);
		dPrinter.print();
		
		GenericPrinter<Boolean> bPrinter = new GenericPrinter<>(true);
		bPrinter.print();
		
		GenericPrinter<Character> cPrinter = new GenericPrinter<>('C');
		cPrinter.print();
		
		
		
		
		

	}

}
