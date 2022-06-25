package com.arcus.javatraining.practice1;

class Dog extends Animal {

	
public String animalName= "Dog";	
  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){

    // this calls overriding method
   // display();

    // this calls overridden method
    super.display();
    System.out.println("Animal name is" + animalName);
    System.out.println("Super class Animal name is" + super.animalName);
  }
}