package com.arcus.javatraining.interfaces;

public class SUV extends M implements AutoMoblie  {
	


	@Override
	public void getspeed() {
		// TODO Auto-generated method stub
		System.out.println("100");
	}

	@Override
	public boolean ispetrol() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void getTransmissionType() {
		// TODO Auto-generated method stub
		System.out.println("Automatic");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "XUV 700";
	}

	public static void main(String args[]) {

		//x=1; final field cannot be reassigned
	
		System.out.println(x);
		
		SUV suv = new SUV();
		
		//suv.x=30;
		System.out.println(suv.getName());
		suv.getspeed();
		suv.getTransmissionType();

		AutoMoblie auto = new SUV();
		auto.getName();

	}

}
