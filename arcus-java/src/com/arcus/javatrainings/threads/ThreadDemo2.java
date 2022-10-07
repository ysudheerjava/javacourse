package com.arcus.javatrainings.threads;

public class ThreadDemo2 {
	

	public static void main(String[] args)
		{
		MyThread t=new MyThread();//Instantiation of a Thread
		t.start();//starting of a Thread
		for(int i=0;i<5;i++)
			{
			System.out.println("Execution of main thread");
			}
		}
	}
	/*
	 * Execution of childThread Execution of childThread Execution of childThread
	 * Execution of childThread Execution of childThread Execution of main thread
	 * Execution of main thread Execution of main thread Execution of main thread
	 * Execution of main thread
	 */

