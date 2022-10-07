package com.arcus.javatraining.wrapperclasses;

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class TestWrapper{  
	
	public void getEmp(Employee emp) {
		
	}
	public static void main(String args[]){  
		//Converting int into Integer  
		int a=20; 
		
		Integer intObj = new Integer(a); //converting primitive type to Object
		
		int b = intObj.intValue();//converting object  back to primitive type
		
		
		double mydoubleval = 44.44;
		
		Double doubleObj = new Double(mydoubleval);
		
		double d = doubleObj.doubleValue();
		
		int intVar= 200;
		
		Integer intObj1= intVar;//Autoboxing
		
		int intVar2= intObj1; //Unboxing
		
				
	}
	}  
