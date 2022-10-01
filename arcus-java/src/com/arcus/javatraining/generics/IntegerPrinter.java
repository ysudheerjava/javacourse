package com.arcus.javatraining.generics;
public class IntegerPrinter{

Integer thingToPrint;


//constructor which takes in thingToPrint value

public IntegerPrinter(Integer t ){
thingToPrint = t;
}

//create a method to print this out when ever its required

public void print() {
	System.out.println(thingToPrint);
}

}