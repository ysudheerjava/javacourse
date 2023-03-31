package com.arcus.javatraining.abstractclasses;

// class Demo1  { //when you are having abstract methods you need to define abstract key word.
	abstract class Demo1{
	public static void  disp1() {
		System.out.println("Concrete method of abstract class");
	}
	

	// public void disp2();//will get compilation error without abstract keyword
	abstract public void disp2();
	abstract public void disp3();
}