package com.arcus.optionaldemo.withoutoptional;

public class Car {

	
	private Maker make;

	Car(Maker make) {
		this.make = make;
	}

	public Maker getMake() {
		return make;
	}

	public void setMake(Maker make) {
		this.make = make;
	}

}

enum Maker {
	TOYOTA, HONDA, FORD;
	 public String name(String name) {
		return name;
	}
}

