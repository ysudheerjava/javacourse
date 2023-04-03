package com.arcus.javatrainings.threads.priority;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("We are in the thread "+Thread.currentThread().getName());
			System.out.println("Thread Priority "+Thread.currentThread().getPriority());
			}

		});
		t.start();
		t.setPriority(10);
		
		
	}
}
