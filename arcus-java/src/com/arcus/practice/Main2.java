package com.arcus.practice;

import java.util.Scanner;

public class Main2 {
	public static void groupTotal(String[] value) {
		int[] arr = new int[26];
		for (String val : value) {
			arr[val.charAt(0) - 'A'] = Integer.parseInt(String.valueOf(arr[val.charAt(0) - 'A']))
					+ Integer.parseInt(val.substring(2));
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print((char) (i + 'A') + ":" + arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		//String[] arr = { "B:-1", "A:1", "B:3", "A:5" };
		Scanner s = new Scanner(System.in);

		// String strArr = s.nextLine();
		// new String[] {"X:-1","Y:1","X:-4","B:3","X:5"}
		// new String[] {"Z:0","A:-1"}
		// new String[] {"Z:0","B:1","A:2"}

		String[] strArr = s.nextLine().replaceAll("[ \"{}\\]\\[(new|String)]", "").split(",");
		groupTotal(strArr);
	}
}