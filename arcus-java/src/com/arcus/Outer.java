package com.arcus;

class Outer {
	class Inner {
		public void method1(){
			System.out.println("me1");
		}
		public void method2(){
			System.out.println("me1");
			method1();
			
		}
	}

	
}