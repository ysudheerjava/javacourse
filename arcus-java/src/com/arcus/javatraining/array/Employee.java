package com.arcus.javatraining.array;
class Employee{
int id;
String name;

public void setData(int id, String name) {
	this.id = id;
	this.name = name;
}
public void displayData(){
System.out.println("Employee ID : "+this.id);
System.out.println("Employee Name : "+this.name);
}
}