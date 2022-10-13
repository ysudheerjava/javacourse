package com.arcus.optionaldemo;

import java.util.Optional;

public class Customer {

	private Optional<Car> car;

	public Customer() {

		car = Optional.empty();

	}

	public Customer(Car c) {
		this.car = Optional.of(c);
	}

	public Optional<Maker> getCustomerCarMake(Customer customer) {
	//return customer.getCar().map(c->c.getMake());//returns an optional
		return customer.getCar().map(Car::getMake);
		
	}

	public static void main(String[] args) {

		Customer customer = new Customer(new Car(Maker.FORD));
		//Customer customer = new Customer();

		String make = customer.getCustomerCarMake(customer).map(Maker::name).orElse("Unknown");
		System.out.println(make);
		

	}

	public Optional<Car> getCar() {
		return car;
	}



}
