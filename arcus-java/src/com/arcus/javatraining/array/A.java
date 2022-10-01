package com.arcus.javatraining.array;

public class A {

	private int i=10;
	private int j=20;
	
	int k =40;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public static void main(String args[]) {
		
		A a  = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		
	}

}
