package com.arcus.javatrainings.threads;

public class Test {
	
	
	public  void printNum1() {
		for(int i=9;i<20;i++) {
			System.out.println(i);
		}
	}
	

	public  void printNum() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		
		Test test = new Test();
		
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				test.printNum();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				test.printNum1();
			}
		});
		t.start();
		t2.start();
		
	}
}
