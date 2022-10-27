package com.arcus.javatraining.innerclasses.nonstaticnested;

class Outer {

	int x = 10;
	static int y = 10;
	private int z=30;

	class Inner {
		
		int x = 100;
		int y =339;

		public void methodOne() {
			int x = 1000;
			int y = 29;
			int z=400;
			
			System.out.println(x);// Prints local variable value of x: 1000
			System.out.println(this.x);// prints Inner class's instance variable value of x: 100
			System.out.println(Outer.this.x);//prints Outer class's instance variable value of x: 10
			
			System.out.println(y);
			System.out.println(this.y);
			System.out.println(Outer.y);
			

			System.out.println(Outer.this.z);
		}

	}

	class AnotherInner {
		int x = 100;

		public void methodOne() {
			int x = 1000;
			System.out.println(x);// 1000
			System.out.println(this.x);// 100
			System.out.println(Outer.this.x);// 10
		}

		public void methodTwo() {
			int x = 1000;
			System.out.println(x);// 1000
			System.out.println(this.x);// 100
			System.out.println(Outer.this.x);// 10
		}
	}

	public static void main(String[] args) {

		// Creating instance of inner class first way

		new Outer().new Inner().methodOne();

		// Creating instance of inner class second way

		/*
		 * Outer outer = new Outer(); 
		 * Outer.Inner i = outer.new Inner();
		 * i.methodOne();
		 */

		// Creating instance of inner class third way
		Outer.Inner i = new Outer().new Inner();
		//i.methodOne();

	}
}