package com.arcus.javatraining.innerclasses.staticnested;

class Test {
	static class Nested {
		public void methodOne() {
			System.out.println("nested class method");
		}
	}

	public static void main(String[] args) {
		Test.Nested t = new Test.Nested();
		t.methodOne();
	}
}