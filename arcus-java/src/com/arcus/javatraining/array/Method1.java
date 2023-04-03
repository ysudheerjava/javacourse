package com.arcus.javatraining.array;

public class Method1 {
	
	public String Mix() {
		String s= "HELLO";
		String s1 ="WORLD";
		String s2 = s+s1;		
	
	return s2;
}
	
	
	
	public static void main(String[] args) {
	
		Method1 M =new Method1();
		
	String Mix= M.Mix();
	System.out.println(Mix);
		

	}

}
