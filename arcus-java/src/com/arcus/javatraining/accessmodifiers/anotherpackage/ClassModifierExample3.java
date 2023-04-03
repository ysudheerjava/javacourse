package com.arcus.javatraining.accessmodifiers.anotherpackage;

import com.arcus.javatraining.accessmodifiers.ClassModifierExample;
import com.arcus.javatraining.accessmodifiers.ClassModifierExample2;

public class ClassModifierExample3 extends ClassModifierExample2{

	public static void main(String args[]) {	
		ClassModifierExample3 c2 = new ClassModifierExample3();
		c2.printMessage();
		//c2.privateMethod();// private method not accessible
		//c2.defaultMethod();//default method not accessible from another package.
		c2.protectedMethod();
		

	}
	
	
}
