package com.arcus.javatrainings.threads.Threadclass;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Cutting Carrots");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Cooking eggs");
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Washing dishes");
			}
		});
		
		List<Runnable> r = new ArrayList<>();
		r.add(t1);
		r.add(t2);
		r.add(t3);
		
		
		MultiExecutor m = new MultiExecutor(r);
		m.executeAll();
		

	}

}
