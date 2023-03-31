package com.arcus.javatrainings.threads;

public class MyThread extends Thread{
	
	Thread t;

	public void run(Thread t) {
		
		/*
		 * for (int i =0;i<5;i++) { System.out.println("Execution of childThread");
		 * 
		 * }
		 */
		t= this.t;
		System.out.println("Execution of childThread"+this.t.getName());

	}
	
	public static void main(String args[]) {
		MyThread m = new MyThread();
		m.start();
	//	System.out.println(m.getName());
	//	System.out.println(Thread.currentThread().getName());
		
		MyThread m1 = new MyThread();
		m1.start();
	//	System.out.println(m1.getName());
	}
}
