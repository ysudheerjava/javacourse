package com.arcus.javatraining.comparable;



public class Car implements Comparable<Car> {

    private String carType;
    private String registrationNo;

    public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Car(String carType, String registrationNo) {
        this.carType = carType;
        this.registrationNo = registrationNo;
    }

 
	@Override
    public int compareTo(Car car) {
    	
		Car otherCar = car;

        int carTypeComparison =
                this.carType.compareTo(otherCar.carType);

        if(carTypeComparison != 0) {
            return carTypeComparison;
        }//if objects are equal compare another field...

        return this.registrationNo.compareTo(otherCar.registrationNo);
    }
}