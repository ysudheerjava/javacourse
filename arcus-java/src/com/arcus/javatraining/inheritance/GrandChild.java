package com.arcus.javatraining.inheritance;

public class GrandChild extends ChildClass {

	//overridden methods
	public String sayHello() {
		return "Ola";
	}
	
	//calling a super class method.
	public String sayHelloFromChild() {
		return super.sayHello();
	}

	public static void main(String[] args) {

		GrandChild grandChild = new GrandChild();

		System.out.println(grandChild.parentAge);
		
		System.out.println(grandChild.getChildAge());
		
		System.out.println(grandChild.sayHello());
		
		System.out.println(grandChild.sayHelloFromChild());
		
		
		

	}

}
