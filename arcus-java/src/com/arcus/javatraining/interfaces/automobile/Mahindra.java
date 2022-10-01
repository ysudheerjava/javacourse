package com.arcus.javatraining.interfaces.automobile;

public class Mahindra implements Car{

	

	@Override
	public String getModelName() {
		
		return "XUV";
	}

	@Override
	public int getMileage() {
	
		return 10;
	}

	@Override
	public int getManufacturingYear() {
	
		return 2022;
	}

}
