package com.arcus.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);

		String key= null;
		StringTokenizer st = new StringTokenizer(s, "{");
		while (st.hasMoreTokens()) {
			 key = st.nextToken();
		}
		System.out.println(key);
		//new String[] {"A:22","D:3","C:4"}

		
		String requiredString= null;
		StringTokenizer st1 = new StringTokenizer(key, "}");
		while (st1.hasMoreTokens()) {
			requiredString = st1.nextToken();
		}
		System.out.println("requiredString"+requiredString);
		
	String newstr=	requiredString.replaceAll("\"", "");
		System.out.println("newstr: "+newstr);
	}
}
