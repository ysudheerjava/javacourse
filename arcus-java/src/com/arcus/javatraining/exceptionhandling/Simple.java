package com.arcus.javatraining.exceptionhandling;

// Java program to illustrate
// unchecked exception propagation
// without using throws keyword
class Simple {
	void m() {
		
		int data = 50 / 0; // unchecked exception occurred
		// exception propagated to n()
		System.out.println("In method m()");
	}

	void n() {
	//	m();
		// exception propagated to p()

		
		  try { m(); // exception handled 
		  } catch (Exception e) {
		  System.out.println("Exception handled in m()"); }
		 
	}

	void p() {

		n();
		/*
		 * try { n(); // exception handled } catch (Exception e) {
		 * System.out.println("Exception handled in P"); }
		 */
	}

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.p();
		System.out.println("Normal flow...");
	}
}
