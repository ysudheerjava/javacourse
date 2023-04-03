package com.arcus.javatraining.innerclasses.nonstaticnested;

public class Main {

	public static void main(String[] args) {
		
		NonstaticNestedEx to= new NonstaticNestedEx();
		
		NonstaticNestedEx.Inner in = to.new Inner();
		
		in.msg();
		
		
		

	}

}
