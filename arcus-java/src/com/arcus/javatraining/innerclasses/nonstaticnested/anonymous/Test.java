package com.arcus.javatraining.innerclasses.nonstaticnested.anonymous;

class Test {
	public static void main(String[] args) {
		
		//anonymous class extending Pizza class--starting of anonymous class
		Pizza p = new Pizza(){
			public void pizzaType() {
				System.out.println("Child extending parent Pizza class");
				System.out.println("Non Veg Pizza");
			}
		};//anonymous class end
		p.pizzaType();// Non Veg Pizza
		
		//parent class
		Pizza p1 = new Pizza();
		p1.pizzaType();// Veg Pizza
	}
}