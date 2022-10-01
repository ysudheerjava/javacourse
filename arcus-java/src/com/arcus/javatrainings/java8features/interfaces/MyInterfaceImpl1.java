package com.arcus.javatrainings.java8features.interfaces;

public class MyInterfaceImpl1 implements MyInterface, MyInterface2 {

	public int doAddition(int i,int j) {
		return i+j;
	}
	@Override
	public void show(int a, int b) {
		// TODO Auto-generated method stub
		MyInterface.super.doAddition(1,4);
		
	}
	
	public static void main(String[] args) {
	}


}
