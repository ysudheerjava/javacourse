package com.arcus.javatrainings.threads;

public class ThreadDemo1 extends Thread {

	public static void main(String[] args) {
		int values[] = {10,20,30,40};
		
		for (int i=1;i<=5; i++) {
			values[i]=i*2;
		}
		
		

	}

}
