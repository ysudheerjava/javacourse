package com.arcus.javatraining.strings;

public class CharArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println((char)(1+'0'));
		
		char[] ch = new char[10];
		
		for(int i =0; i<ch.length;i++) {
			ch[i]= (char) (i+'0');
		}
		for(int i =0; i<ch.length;i++) {
		System.out.println(ch[i]);
		}

	}

}
