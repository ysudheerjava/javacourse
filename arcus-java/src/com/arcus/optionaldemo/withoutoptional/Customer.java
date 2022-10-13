package com.arcus.optionaldemo.withoutoptional;

public class Customer {

	private Car car;

	public Customer() {

	}

	public Customer(Car car) {
		this.car = car;
	}

	public Maker getCustomerCarMake(Customer customer) {
		
		if(customer!=null && customer.getCar()!=null) {
			return customer.getCar().getMake();
		}
		return null;
	}

	public static void main(String[] args) {
	
		Customer customer1 = new Customer(new Car(Maker.FORD));
		Customer customer = new Customer();

		System.out.println(customer.getCustomerCarMake(customer));

	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	};

}
