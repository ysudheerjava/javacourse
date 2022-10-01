package com.arcus.javatraining.comparator;

import java.util.*;

class NameComparator implements Comparator<Person> {
	
	public int compare(Person o1, Person o2) {

		return o1.name.compareTo(o2.name);
	}
}