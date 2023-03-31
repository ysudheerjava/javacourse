package com.arcus.javatraining.strings.stringbuffer;

import org.openjdk.jol.vm.VM;

public class StringBufferExample {

	public static void main(String[] args) {

		String str = new String("Arcus");

		StringBuffer strBuff = new StringBuffer("Arcus");

		System.out.println();

		System.out.println("****************Before modidfication********************");

		System.out.println("The memory address of str is " + VM.current().addressOf(str));
		System.out.println("The memory address strBuffof is " + VM.current().addressOf(strBuff));

		str = str.concat("Infotech");
		strBuff = strBuff.append("InfoTech"); // appends a string in the previously defined string.

		System.out.println();
		System.out.println("****************After modidfication********************");

		System.out.println(str);
		System.out.println(strBuff);

		System.out.println("The memory address of str is " + VM.current().addressOf(str));
		System.out.println("The memory address is strBuff" + VM.current().addressOf(strBuff));
		
		

	}
}
