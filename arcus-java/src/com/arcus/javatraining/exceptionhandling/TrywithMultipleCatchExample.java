package com.arcus.javatraining.exceptionhandling;

class TrywithMultipleCatchExample {
	public static void main(String[] args) {
		try {
			
	//		throw new Exception();
			
			System.out.println(10 / 0);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
