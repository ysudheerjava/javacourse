package com.arcus.javatrainings.collections.sorting;

public class Employee implements Comparable {

	Integer empId;
	String name;

	Employee(int id, String name) {
		this.empId = id;
		this.name = name;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Override public int compareTo(Object o) { Car other = (Car) o;
	 * 
	 * int carTypeComparison = this.carType.compareTo(other.carType);
	 * 
	 * if(carTypeComparison != 0) { return carTypeComparison; }
	 * 
	 * return this.registrationNo.compareTo(other.registrationNo); } }
	 */

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;

		int comparisionResult = this.empId.compareTo(emp.empId);
		if (comparisionResult != 0) {
			return comparisionResult;
		}

		return this.name.compareTo(emp.name);
	}

}
