package com.arcus.javatraining.interfaces;

public class InterfaceDemoImpl implements InterfaceDemo {

	public void method1() {
		System.out.println("Method1");
	}

	public void method2() {
		System.out.println("Method2");
	}

	public static void main(String args[]) {

		// Central c = new Central();

		InterfaceDemoImpl ifaceDemo1 = new InterfaceDemoImpl();

		
		//<Interface name> reference variabe = new <Implementation Class()>
		InterfaceDemo ifaceDemo = new InterfaceDemoImpl();

		InterfaceDemo ifaceDemo2;
		ifaceDemo = new InterfaceDemoImpl();

		ifaceDemo.method1();
		ifaceDemo.method2();
		
	

		System.out.println(InterfaceDemo.myVar);

	}

}
