package com.arcus.javatraining.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.arcus.javatraining.interfaces.functional.Interf1;
import com.arcus.javatraining.interfaces.functional.Interf2;
import com.arcus.javatraining.interfaces.functional.Interf3;

public class InterfImpl2 {

	public static void main(String[] args) {

		Interf1 f1;

		f1 = (i, j) -> i + j;

		System.out.println(f1.m1(10, 20));

		Interf2 f2;

		f2 = (i, j) -> {
			int a = i + 10;
			int b = j + 10;
			return a + b;
		};

		System.out.println();
		f2.m2(10, 10);

		Interf3 f3;
		f3 = (i, j) -> {
			String x = i;
			String y = j;
			return x + y;
		};
		System.out.println(f3.m3("Hello", "World"));

	}

}
