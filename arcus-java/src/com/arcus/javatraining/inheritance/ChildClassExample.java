package com.arcus.javatraining.inheritance;


//Child
public class ChildClassExample extends BaseClassExample{
	

	public void doSomething() {
		System.out.println("ChildClassExample");	
	}
	
	
	public static void main(String args[]) {
	
		ChildClassExample myChildInstance = new ChildClassExample();
		
		System.out.println(myChildInstance.i);
		
		int childNumber=  myChildInstance.displayNumber(20);
		
		System.out.println(childNumber);
		
	}

}



