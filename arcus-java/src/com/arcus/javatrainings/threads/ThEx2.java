package com.arcus.javatrainings.threads;

public class ThEx2 extends Thread {

	public void start() {
		System.out.println("in Start");
		// super.start();
	}

	public void run() {
		System.out.println("In run");
	}

	public static void main(String[] args) {
		ThEx2 t = new ThEx2();
		t.start();

	}

}
