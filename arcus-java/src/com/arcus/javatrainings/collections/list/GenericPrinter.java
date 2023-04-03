package com.arcus.javatrainings.collections.list;

public class GenericPrinter <T> {
	
	T thingToPrint;  //generic
	
	GenericPrinter(T thingToPrint){
		this.thingToPrint=thingToPrint;
	}
	
	
	public void print(){
		System.out.println(thingToPrint); 
	}
	
	

}
