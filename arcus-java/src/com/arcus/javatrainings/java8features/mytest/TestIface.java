package com.arcus.javatrainings.java8features.mytest;

@FunctionalInterface

 interface TestIface {
	
	void show(int i);
	//void shows(int i);
	
	 default void show1() {
		System.out.println("s");
	}
	 
	 public static void show3() {
		 System.out.println("s");
	 }

}
