package com.arcus.javatraining.helloworld;

public class Student {
	
	int i =10;
	int j =20;
	
	public void doSomething() {
		System.out.println("");	
	}
	
	
	//Student(){}
	
	public static void main(String args[]) {
		
		Student student1 = new Student();  //creating
		Student student2 = new Student(); 
		
		
		System.out.println(student1.i);
		student1.doSomething();
		
		System.out.println(student2.i);
		
		
		
	}

}
