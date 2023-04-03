package com.arcus.javatraining.interfaces.functional;

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		InterfaceDemo id = (x, y) -> System.out.println(+x + y);

		id.add(10, 20);
		
		id.doSomething1();
		InterfaceDemo.doSomethingElse1();
		InterfaceDemo.doSomethingElse2();

	}

}
