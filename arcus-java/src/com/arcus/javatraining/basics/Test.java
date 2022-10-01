package com.arcus.javatraining.basics;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

class Test {
	public static void main(String[] args) {
		// print distinct alphabets in a letter.
		Set s = new HashSet();
		String str = "Malayalam";
		
		String xy="";
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			hs.add(a);
		}

		for (char a : hs) {
			System.out.println(a);
		}

	}
}
