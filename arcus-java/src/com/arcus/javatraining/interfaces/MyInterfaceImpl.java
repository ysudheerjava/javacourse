package com.arcus.javatraining.interfaces;

public class MyInterfaceImpl implements MyInterface,Animal {

	public void displayText() {
		System.out.println("Text in MyInterfaceImpl");
	}

	public void displayNumbers() {
		System.out.println("123456789");
	}

	public static void main(String args[]) {

		MyInterfaceImpl myInstance = new MyInterfaceImpl();
		String mycompany = MyInterface.COMPANY_NAME;
		System.out.println(mycompany);
		myInstance.displayText();
		myInstance.displayNumbers();

		;
	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
	}

}
