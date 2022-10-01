package com.arcus.javatraining.inheritance;

public class ChildClass extends ParentClass {

	public int getChildAge() {

		return 22;

	}

	
	  public String sayHello() {
		  //  String greeting= "Hello"; 
		 // return super.sayHello();

		  return "Hi"; 
	  }
	 
	
	

	public static void main(String[] args) {

		ChildClass child = new ChildClass();

		System.out.println(child.parentAge);

		System.out.println(child.sayHello());
		System.out.println(ParentClass.getParentAge());

	}

}
