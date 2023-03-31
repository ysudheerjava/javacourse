package com.arcus.javatraining.abstractclasses;

public class Demo1Impl extends Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1Impl dm = new Demo1Impl();
		disp1();
		dm.disp2();
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		
		System.out.println("Implemented abstract method of abstract class");
	}
	
	
	public static void disp1() {
		// TODO Auto-generated method stub
		
		System.out.println("overridden abstract method of abstract class");
	}

	@Override
	public void disp3() {
		// TODO Auto-generated method stub
		
	}

}
