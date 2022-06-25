package com.arcus.javatraining.multithreading;

public class MyRunnableClass implements Runnable {

	public static void main(String[] args) {
		
		Thread t = new Thread(new MyRunnableClass());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable class");
	
		
	}

}
