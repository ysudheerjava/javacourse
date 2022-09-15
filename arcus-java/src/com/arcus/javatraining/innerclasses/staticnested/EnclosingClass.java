package com.arcus.javatraining.innerclasses;

import org.junit.Test;

public class Enclosing {
	private static int x = 1;
	private int myx=10;

	public static class StaticNested {
		private int y=10;
		private void run() {
			Enclosing.x=20;
// method implementation
		}
	}

	@Test
	public void test() {
		Enclosing.StaticNested nested = new Enclosing.StaticNested();
		nested.run();
	}
}
