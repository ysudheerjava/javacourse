package com.arcus.javatraining.innerclasses.nonstaticnested.anonymous;

public class AnonymousDemo {

	public static void main(String[] args) {

		//anonymous inner class implementing the interface "Age"
		Age ageObj = new Age() {

			public void getAge() {
				// printing age
				System.out.print("Age is " + age);
			}
		};

		ageObj.getAge();

	}

}
