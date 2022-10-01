package com.arcus.javatraining.accessmodifiers;

import com.arcus.javatraining.accessmodifiers.anotherpackage.Test;

class VariablesEx {
	
	protected int  mark1=10;
	 public int mark2 =30;
	int i = 100;
	
	 static int myStatic =20;
	
	  void myMethod() {
		
		int m = 10;
		int i =10;
		int j =20;
		String myString ="Arcus";
	}
	
	
	public void myMethod1() {
		
		int i =10;
		int j =20;
		String myString ="Arcus";
	}
	
	
	public static void main(String args[]) {
		
	
		int myInt = VariablesEx.myStatic;
		
		VariablesEx ve= new VariablesEx();
		ve.mark1=20;
		ve.myMethod();
		//System.out.println(ve.mark1);
		ve.myStatic = 30;
		
		System.out.println(ve.myStatic);
		
		
		VariablesEx ve1= new VariablesEx();	
		ve1.mark1 = 30;
		System.out.println(ve1.myStatic);
		//System.out.println(ve1.mark1);
		
		VariablesEx ve2= new VariablesEx();	
		System.out.println(ve2.myStatic);
		//System.out.println(ve2.mark1);
		
		
		TestPrivate tp = new TestPrivate();
		System.out.println(tp.getPrivateVar());
		System.out.println(tp.name);
		
		Test t = new Test();
		System.out.println(t.getPrivateVar());
		
		
	}

}
