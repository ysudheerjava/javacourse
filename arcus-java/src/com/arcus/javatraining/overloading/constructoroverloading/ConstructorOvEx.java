package com.arcus.javatraining.overloading.constructoroverloading;

public class ConstructorOvEx {

	String name;
	int id;

	ConstructorOvEx() {

	}

	ConstructorOvEx(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public static void main(String args[]) {
		ConstructorOvEx con = new ConstructorOvEx();
		
		ConstructorOvEx con1 = new ConstructorOvEx("Sudheer", 10);
		
		System.out.println(con1.id);
		System.out.println(con.id);

	}

}
