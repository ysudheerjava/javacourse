package com.arcus.javatraining.accessmodifiers.anotherpackage;



public class Test {
	private String privateVar = "Sudheer";
	private String anotherPrivateVar = "Sudheer";
	String name = "Sudheer";

	public String getPrivateVar() {
		return privateVar;
	}

	public void setPrivateVar(String privateVar) {
		
		
		this.privateVar = privateVar;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Welcome");
		
	}

}