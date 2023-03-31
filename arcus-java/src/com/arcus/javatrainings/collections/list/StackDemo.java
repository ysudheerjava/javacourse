package com.arcus.javatrainings.collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();

		st.push("Book1");
		st.push("Book2");
		st.push("Book3");
		st.push("Book4");
		System.out.println("Sta" + st);
		
		for(Object st1:st) {
			System.out.println(st1);
		}

	st.pop();
	
	for(Object st1:st) {
		System.out.println(st1);
	}


	//	System.out.println(st);

	}

}
