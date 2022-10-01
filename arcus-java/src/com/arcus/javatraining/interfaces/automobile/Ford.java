package com.arcus.javatraining.interfaces.automobile;

public class Ford implements Car {

	public String getModelName() {

		return "Ford Endeavour";

	}

	public int getManufacturingYear() {

		int manufacturingYear = 2020;
		return manufacturingYear;
	}

	public int getMileage() {

		int mileage = 10;
		return mileage;
	}

	

	@Override
	public String autoMobileType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void myMethod222() {
		
	}
	
	public static void main(String args[]) {
		
		Ford ford = new Ford();
		
		Car ford1 = new Ford();
		
		Car mahindra = new Mahindra();
		
		Car mg = new MG();
		
		
		System.out.println(ford.autoMobileType());
		System.out.println(ford.getManufacturingYear());
	
		ford.myDefaultMethod();
		Car.myStaticMethod();
		
	}

}
