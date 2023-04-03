package com.arcus.javatraining.innerclasses.nonstaticnested.anonymous;

public class AgeImpl implements Age {

	@Override
	public void getAge() {
		System.out.println("Age is 20");

	}

	public static void main(String[] args) {

		AgeImpl agimpl = new AgeImpl();
		agimpl.getAge();

	}

}
