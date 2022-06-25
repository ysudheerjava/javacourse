package com.arcus.javatraining.multithreading;
 class MyClass extends Thread {
	
	
	public void run() {
		System.out.println("Run Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass m = new MyClass();
		m.start();

	}

}
