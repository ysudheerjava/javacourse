package com.arcus.javatraining.variables;

public class StaticInstanceVarDemo {
	
	
	int x=10;
	static int y =20;
	
	public static void main(String args[]) {
		
		StaticInstanceVarDemo s1 = new StaticInstanceVarDemo();
		
		System.out.println(s1.x);//10
		System.out.println(s1.y);//20
		
		s1.x=30;
		y=40;
		
		StaticInstanceVarDemo s2= new StaticInstanceVarDemo();
		System.out.println("s2.x:"+s2.x);//10
		System.out.println("s2: "+s2.y); //40
		
		System.out.println(s1.x);//30
		System.out.println(s1.y);//20
		
		
	}

}
