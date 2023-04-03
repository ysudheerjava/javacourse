package com.arcus.javatraining.superthisexample;

public class Superclass {

	String s = "super";
	
	Superclass(){
		System.out.println("Superclass construcor");
	}
	

	Superclass(String s){
		System.out.println("Superclass construcor");
	}
	
	public void y() {

		System.out.println("Super class method ");
	}

	
	public void z() {

		System.out.println("Super class method z called ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
