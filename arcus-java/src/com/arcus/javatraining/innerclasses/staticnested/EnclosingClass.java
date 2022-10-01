package com.arcus.javatraining.innerclasses.staticnested;

import org.junit.Test;

public class EnclosingClass {
	private static int x = 1;
	private int myx=10;
	
	public static void mymethod() {
		doSo();
	}

	
	public void mymethod1() {
		doSo();
	}

	public static class StaticNested {
		private int y=10;
		private void run1() {
			EnclosingClass.x=20;
			// method implementation
			
			EnclosingClass cl = new EnclosingClass();
			doSo();
			cl.mymethod1();
		}
		
		
		
	}

	public static void doSo() {
	EnclosingClass en = new EnclosingClass();
	EnclosingClass.StaticNested nested= new EnclosingClass.StaticNested();
	nested.run1();
}
	
	public static void main(String args[]) {
		
		EnclosingClass.StaticNested nested = new EnclosingClass.StaticNested();
		nested.run1();
	}
}
