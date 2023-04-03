package com.arcus.javatraining.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Simple2 {
	void m() {

		int data = 50 / 0; // unchecked exception occurred propogated to n()

	}

	void n() {
		// m();
		// exception propagated to p()

		try {
			m(); // exception handled
		} catch (Exception e) {
			System.out.println("Exception handled in m()");
		}

	}

	void p() throws FileNotFoundException {

		// n();
		/*
		 * try { n(); // exception handled } catch (Exception e) {
		 * System.out.println("Exception handled in P"); }
		 */

		File fi = new File("c:/t.txt");
		FileReader f = new FileReader(fi);

	}

	public static void main(String args[]) throws FileNotFoundException {
		Simple2 obj = new Simple2();
		obj.p();
		System.out.println("Normal flow...");
	}
}
