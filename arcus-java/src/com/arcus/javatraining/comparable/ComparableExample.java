package com.arcus.javatraining.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	public static void main(String[] args) {

		/*
		 * Integer valA=45; Integer valB=99; Integer valC=99;
		 * 
		 * 
		 * int comparisonA = valA.compareTo(valB); int comparisonB =
		 * valB.compareTo(valA); int comparisonC = valB.compareTo(valC);
		 * 
		 * System.out.println(comparisonA); System.out.println(comparisonB);
		 * System.out.println(comparisonC);
		 */

		ArrayList<Car> al = new ArrayList<Car>();

		al.add(new Car("SUV", "2345"));
		al.add(new Car("Sedan", "2345s"));
		al.add(new Car("Convertible", "0123"));
		al.add(new Car("Convertible", "0124"));
		al.add(new Car("Addan", "2345s"));
		al.add(new Car("Addan", "2345"));

		Collections.sort(al);

		for (Car car : al) {
			System.out.println(car.getCarType() + " " + car.getRegistrationNo());
		}

	}
}
