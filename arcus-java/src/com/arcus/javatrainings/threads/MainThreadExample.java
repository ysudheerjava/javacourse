package com.arcus.javatrainings.threads;

public class MainThreadExample {
	
	public static void main(String args[]) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		//output: Thread[main,5,main]
		thread.setName("My thread");
		System.out.println(thread);
		//first part: name of the thread
		//second part: thread priority
		//thread group
	}

}
