package com.arcus.javatraining.comparator;

import java.util.Comparator;

public class AgeComparatorLambda {
	
	Comparator<Person> c=(s1,s2)-> {if (s1.age == s2.age)
		return 0;
	else if (s1.age > s2.age)
		return 1;
	else
		return -1;};

}
