package com.arcus;

public class Testclass {
	
	int a;
	int b;
	
	Testclass(int a, int b){
		this.a=a;
		this.b=b;
		}

	public static void main(String[] args) {
		
		Testclass tc = new Testclass(10,20);
		int a =tc.a;
		System.out.println(tc.a);

		
	}

}
