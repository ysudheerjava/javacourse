package com.arcus.javatrainings.collections.list;

import java.util.Vector;

public class VectorDemonstration {

	public static void main(String[] args) {

		Vector<String> fruits = new Vector<>();

		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Grape");
		fruits.add("Orange");

		for (int i = 0; i < fruits.size(); i++) {

			System.out.println(fruits.get(i));

		}

		Vector studentNames = new Vector(100); // initial capacity

		Vector names = new Vector(100, 10);// initial capacity, incremental capacity

		System.out.println("Capacity of fruits vector: " + fruits.capacity());
		System.out.println("size of fruits vector: " + fruits.size());

	}

}
