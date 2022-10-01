package com.arcus.javatraining.interfaces;

public class Dog implements Animal {

	public void animalSound() {
		System.out.println("Bow Bow");

	}

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.animalSound();

	}

}
