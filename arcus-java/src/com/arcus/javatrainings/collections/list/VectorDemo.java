package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> motorBikes = new Vector<>();
		// LinkedList<String> ll = new LinkedList();
		
		//constructor with initial capacity
		Vector v = new Vector(100);
		
		//VEctor v = new Vector(int initial capacity, int incrementalcapacity)
		Vector v1= new Vector(100, 10);
		
		

		motorBikes.add("Yamaha");
		motorBikes.add("Honda");
		motorBikes.add("Bullet");
		motorBikes.add("Suzuki");
		motorBikes.set(3, "Kawasaki");
		
		motorBikes.add("Triumph");
		motorBikes.add("Ducati");
		motorBikes.add("Vespa");
		motorBikes.addElement("Honda");
		

		for (int i = 0; i < motorBikes.size(); i++) {

			System.out.println(motorBikes.get(i));

		}
		
		
		
		motorBikes.remove(0);
		motorBikes.removeElement("Honda");
		motorBikes.removeElementAt(0);
		

		for (int i = 0; i < motorBikes.size(); i++) {

			System.out.println(motorBikes.get(i));
			

		}
		
		//to retrieve elements
		System.out.println("Element at method"+motorBikes.elementAt(0));
		System.out.println(motorBikes.get(1));
		System.out.println(motorBikes.firstElement());
		System.out.println(motorBikes.lastElement());
		
		//some other methods of vector
		System.out.println("Size of Vector "+motorBikes.size());
		System.out.println("Capacity of Vector "+motorBikes.capacity());
		
	
		//Using Enumeration to retrieve the elements.
		
		Enumeration e = motorBikes.elements();
		System.out.println("Enumerating elemtns....");
		while(e.hasMoreElements()) {
			
			String myBike= (String) e.nextElement();
			
			System.out.println(myBike);
			
		}
		
		
		
		
		
		
		

	}

}
