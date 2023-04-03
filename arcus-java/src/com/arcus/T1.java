package com.arcus;

public class T1 extends T2 {
	
	public void d() {
		System.out.println("d");
	}
	
	public  void s() {
		System.out.println("s");
		super.s();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T1 t = new T1();
		t.s();
		
		
		T2 t2 = new T2();
		t2.s();

	}

}
