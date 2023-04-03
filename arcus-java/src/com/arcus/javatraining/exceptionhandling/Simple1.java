package com.arcus.javatraining.exceptionhandling;

class Simple1 {
	void m() {

		int data = 50 / 0; // unchecked exception occurred propogated to n()

	}
                  
	void n() {
		m();
		// exception propagated to p()

		/*
		 * try { m(); // exception handled } catch (Exception e) {
		 * System.out.println("Exception handled in m()"); }
		 */

	}

	void p() {

		n();
		/*
		 * try { n(); // exception handled } catch (Exception e) {
		 * System.out.println("Exception handled in P"); }
		 */
	}

	public static void main(String args[]) {
		Simple1 obj = new Simple1();
		obj.p();
		System.out.println("Normal flow...");
	}
}
