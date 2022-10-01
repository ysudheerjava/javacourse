package com.arcus.javatraining.interfaces.automobile;

public class MG implements Car,Engine{

	@Override
	public String getModelName() {
		return "Hectar";
	}

	@Override
	public int getMileage() {
		return 10;
	}

	@Override
	public int getManufacturingYear() {
		return 2022;
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

	
	
}
