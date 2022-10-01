package com.arcus.javatraining.abstractclasses;

public class DemoImpl extends Demo1{
	
	public void disp2() {
		System.out.println("Implementing Abstract class Demo1's disp2() method");
	}
	
	
	  public void disp3() {
	  System.out.println("Implementing Abstract class Demo1's disp3() method"); }
	 
	  
	  public static void  disp1() {
			System.out.println("Overriding disp ");
	  }

	public static void main(String[] args) {
	
		DemoImpl demo = new DemoImpl();
		//Demo1 d = new Demo1();//cannot instantiate an Abstract class
		demo.disp2();
		demo.disp3();
		
		

	}

}
