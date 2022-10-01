package com.arcus.javatraining.comparator;

import java.util.*;

class AgeComparator implements Comparator<Person> {
	
	public int compare(Person s1, Person s2) {
		
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}