package com.arcus.javatrainings.collections.list;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {

		Stack st = new Stack();
		
		st.push("Book1");
		st.push("Book2");
		st.push("Book3");
		st.push("Book4");
		st.push("Book5");
		
		for(Object st1: st) {
			System.out.println(st1);
		}
		
		System.out.println();
		System.out.println("Popping the element out of stack....");
		
		st.pop();
		for(Object st1: st) {
			System.out.println(st1);
		}

	}

}
