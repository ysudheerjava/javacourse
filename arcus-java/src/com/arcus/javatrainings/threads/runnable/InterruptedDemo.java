package com.arcus.javatrainings.threads.runnable;

import java.io.IOException;

public class InterruptedDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new WaitingForUserInput());
		thread.setName("InputWaitingThread");
		thread.start();
		System.out.println("1");
	}

	private static class WaitingForUserInput implements Runnable {
		@Override
		public void run() {
		
			try {
				System.out.println("2");
				while (true) {
					System.out.println("3");
					char input = (char) System.in.read();
					if (input == 'q') {
						System.out.println("4");
						return;
					}
					System.out.println("3.1");
				}
			} catch (IOException e) {
				System.out.println("An exception was caught " + e);
			}
			;
		}
	}
}