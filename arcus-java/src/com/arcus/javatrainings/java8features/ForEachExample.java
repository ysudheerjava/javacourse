package com.arcus.javatrainings.java8features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Predicate;

public class ForEachExample {

	public static void main(String[] args) {
	
		// printing a Collection of Strings:
		
		String[] stringArray = new String[4];
		stringArray[0] = "India";
		stringArray[1] = "US";
		stringArray[2] = "UK";
		stringArray[3] = "Australia";
		
		
		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("India") ;
		stringArrayList.add("USA") ;
		stringArrayList.add("UK") ;
		stringArrayList.add("Australia") ;
		
		HashSet<String> stringHashSet = new HashSet<>();
		stringHashSet.add("India") ;
		stringHashSet.add("USA") ;
		stringHashSet.add("UK") ;
		stringHashSet.add("Australia") ;
		stringHashSet.add("Australia") ;
		
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(100) ;
		
		
		//enhanced for loop
		for (String name : stringArray) {
		    System.out.println(name);
		}
		
		stringArrayList.forEach(name -> {
		    System.out.println(name);
		});
		
		
		stringHashSet.forEach(namd -> {
		    System.out.println(namd);
		});
		

		
		
		
	
		
		
	}

}
