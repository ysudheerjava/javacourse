package com.arcus.javatraining.innerclasses.staticnested;

public class Main {

	public static void main(String[] args) {
		
		Outer1 to= new Outer1();
		
		Outer1.Inner in = to.new Inner();
		
		in.msg();
		
		
		

	}

}
