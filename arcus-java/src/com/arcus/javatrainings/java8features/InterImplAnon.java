package com.arcus.javatrainings.java8features;

public class InterImplAnon {
	
	Interf1 if1= new Interf1() {

		
		public int m1(int arg1, int arg2) {
			return arg1+arg2;
		}
		
	};

	public static void main(String[] args) {
		
		InterImplAnon anon= new InterImplAnon();
		
		System.out.println(anon.if1.m1(11, 22));

	}

}
