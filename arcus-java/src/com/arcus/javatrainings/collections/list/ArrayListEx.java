package com.arcus.javatrainings.collections.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> motorBikes = new ArrayList<>();
	//	LinkedList<String> ll = new LinkedList();
		
		motorBikes.add("Yamaha");
		motorBikes.add("Honda");
		motorBikes.add("Bullet");
		motorBikes.add("Suzuki");
		motorBikes.set(3, "Kawasaki");
		motorBikes.add("Triumph");
		motorBikes.add("Ducati");
		motorBikes.add("Vespa");
		
	
		
		System.out.println(motorBikes instanceof Serializable); //true
	//	System.out.println(ll instanceof Cloneable); //true
		System.out.println(motorBikes instanceof RandomAccess); //true
//		System.out.println(ll instanceof RandomAccess); //false
		
		System.out.println("Getting index 3 value "+motorBikes.get(3));
		
		/*
		 * motorBikes.remove(2); System.out.println(motorBikes);
		 */
		System.out.println("Size: "+motorBikes.size());
		
		
		for(int i =0; i<motorBikes.size();i++) {
			System.out.println(motorBikes.get(i));
		}
		
		motorBikes.remove(3);
		
		System.out.println("Getting index 3 value "+motorBikes.get(3));
		
		Collections.sort(motorBikes);
	
		
		System.out.println("**********************");
		for (String motorBike:motorBikes) {
			System.out.println(motorBike);
		}
		
		
		
		
		
		
		
	}
	
}
	