package com.arcus.javatraining.abstractclasses;

abstract class Computer extends Employee {
	
	abstract public void process();
	
	abstract public void display();
	
	public void generalFeatures() {
		System.out.println("Common Features of a computer: ");
		System.out.println("Hard disk");
		System.out.println("RAM");
		System.out.println("Monitor");
	}


}
