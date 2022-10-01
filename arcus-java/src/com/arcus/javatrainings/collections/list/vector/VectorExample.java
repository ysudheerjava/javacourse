package com.arcus.javatrainings.collections.list.vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		
		for (int i=1; i<=10; i++) {
			vector.addElement(i);
		}
		
		
		
	
		System.out.println(vector);
		vector.addElement("Sudheer");
		System.out.println("size"+vector.size());
		
		System.out.println(vector.capacity());

	}

}
