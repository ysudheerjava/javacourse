package com.arcus.javatrainings.java8features;

import java.util.function.Consumer;

public class Vehicle<T> implements Consumer<T> {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	@Override
	public void accept(Object t) {
		System.out.println(t);
		
	}

}
