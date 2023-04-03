package com.arcus.javatrainings.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort_UserDefinedObject {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(new Employee(1033,"Sandy"));
		l.add(new Employee(101,"Sweety"));
		l.add(new Employee(132,"Bunty"));
		l.add(new Employee(99903,"Zandy"));
	
		System.out.println(l);
		for (Object e:l) {
			Employee e1 = (Employee)e;
			System.out.println(e1.getEmpId());
		}
		System.out.println("*******************************************************");
		
		Collections.sort(l);
		
		for (Object e:l) {
			Employee e1 = (Employee)e;
			System.out.println(e1.getEmpId());
		}
	
		
		

	}

}
