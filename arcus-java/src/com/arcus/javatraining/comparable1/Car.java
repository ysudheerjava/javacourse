package com.arcus.javatraining.comparable1;

public class Car implements Comparable {

	private String carType = null;
	private String registrationNo = null;

	public Car(String carType, String registrationNo) {
		this.carType = carType;
		this.registrationNo = registrationNo;
	}

	@Override
	public int compareTo(Object o) {
		Car other = (Car) o;

		int carTypeComparison = this.carType.compareTo(other.carType);

		if (carTypeComparison != 0) {
			return carTypeComparison;
		}

		return this.registrationNo.compareTo(other.registrationNo);
	}
}
