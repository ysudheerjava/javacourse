package com.arcus.javatraining.interfaces;

public class Car implements AutoMoblie {

	
	@Override
	public void getspeed() {
		// TODO Auto-generated method stub
		System.out.println("100");
	}

	@Override
	public boolean ispetrol() {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
	Car s=new Car();
	s.getspeed();
	System.out.println(s. ispetrol());
	}

	@Override
	public void getTransmissionType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}