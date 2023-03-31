package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// creation and initializing an array
		int[] intArr = new int[10];

		// creation and initializing an ArrayList
		ArrayList ar = new ArrayList();
		
		

		// String ArrayList - list of some Software languages - Strings

		ar.add("Java");
		ar.add("C");
		ar.add("Java");
		ar.add("Python");

		ar.add(1);
		ar.add(true);
		ar.add('A');

		ar.add(23.33);

		ar.add(null);

		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {

			// retrieval of elements from array
			// System.out.println(ar[i]);

			// retrieval of elements from ArrayList using get
			System.out.println(ar.get(i));

			// (current capacity*3/2)+1.

		}

		int a = 20; // primitive type
		Integer i = Integer.valueOf(a);

		Integer b = a; // autoboxing

		int c = b; // unboxing

		byte b1 = 10;
		short s = 20;
		int i1 = 30;
		long l = 40;
		float f = 50.5F;
		double d = 60.66d;
		char c1 = 'a';
		boolean b3 = true;

		// Autoboxing, converting primitives into objects

		// Autoboxing: Converting primitives into objects
		Byte byteobj = b1;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c1;
		Boolean boolobj = b3;
		
		
		ArrayList<Employee> empArrList = new ArrayList<>();
		

		empArrList.add(new Employee(100,"Mohan"));	
		empArrList.add(new Employee(101,"Sam"));
		empArrList.add(new Employee(102,"Sami"));
	
		System.out.println("****************************************");
		for(Employee e:empArrList) {
			System.out.println(e.getEmpName() );
		}

	}

}
