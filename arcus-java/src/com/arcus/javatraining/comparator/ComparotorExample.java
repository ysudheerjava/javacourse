package com.arcus.javatraining.comparator;

import java.util.*;
import java.io.*;

public class ComparotorExample {
	public static void main(String args[]) {

		ArrayList<Person> al = new ArrayList<>();
		
		al.add(new Person(101, "Vijay", 23));
		al.add(new Person(106, "Ajay", 27));
		al.add(new Person(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Person st = (Person) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Person st = (Person) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}