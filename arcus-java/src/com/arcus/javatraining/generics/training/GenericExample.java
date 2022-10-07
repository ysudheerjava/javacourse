package com.arcus.javatraining.generics.training;

public class GenericExample {

	public static void main(String[] args) {
		
		Printer<String> printer = new Printer<>("Arcus");
		printer.print();
	
		Printer<Integer> iPrinter = new Printer<>(1000);
		iPrinter.print();
		
		Printer<Double> dPrinter = new Printer<>(300.00);
		dPrinter.print();

		
		dPrinter.genericMethod(300);

		
		
		/*
		 * dPrinter.genericMethod("Generic method call..Sudheer");
		 * dPrinter.iGgenericMethod("Generic method call..Sudheer",20,30);
		 * 
		 * dPrinter.genericMethod("Generic method call..Sudheer");
		 * 
		 * dPrinter.genericMethod(777);
		 * 
		 * dPrinter.genericMethod(300.99);
		 */
			
		
			
			
		/*
		 * String myCity = dPrinter.genericReturn("Hyderabad");
		 * System.out.println(myCity);
		 * 
		 * 
		 * Integer myTotal = dPrinter.genericReturn(100); System.out.println(myTotal);
		 */
			
			
			
			
			/*
			 * String myVar=dPrinter.genericReturn("Sudheer");
			 * System.out.println("*************"+myVar);
			 * 
			 * 
			 * Integer myInt=dPrinter.genericReturn(239);
			 * System.out.println("*************"+myInt);
			 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * float f =3.4f;
		 * 
		 * double d =33.3; IntegerPrinter printer = new IntegerPrinter(44);
		 * printer.print();
		 * 
		 * DoublePrinter doublePrinter = new DoublePrinter(44.44);
		 * doublePrinter.print();
		 * 
		 * Printer<Integer> gPrinter = new Printer<>(100); gPrinter.print();
		 * 
		 * Printer<Double> gDoublePrinter = new Printer<>(100.40);
		 * gDoublePrinter.print();
		 * 
		 * Printer<String> gStringPrinter = new Printer<>("Arcus Infotec");
		 * gStringPrinter.print();
		 * 
		 * String s = gStringPrinter.shout("Non generic call"); System.out.println(s);
		 * 
		 * gStringPrinter.gShout("Genric call"); gStringPrinter.gShout(123);
		 * gStringPrinter.gShout(222.34);
		 */

	}

}
