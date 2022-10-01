package com.arcus.javatraining.abstractclasses;

public class Employee {
	
	int i =10;
	
	public  void myMethod(){
		i=i+10;
		System.out.println("myMethod:  "+i);
	}
	
	public  void myMethod1(){
		
		System.out.println("myMethod1:  "+i);
	}
	
	public static void main(String args[]) {
		
		Employee e = new Employee();
		
		Employee e2 = new Employee();
		e.myMethod();
		e.myMethod1();
		System.out.println(e.i);
		System.out.println(e2.i);
		System.out.println("Normal Class");
		
		}

}
