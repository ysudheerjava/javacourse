package com.arcus.javatraining.strings;

class ComparingString {
	public static void main(String args[]) {
		String str1 = "c4learn.com";
		String str2 = "c4learn.com";
		String str3 = "c4learn.com";
		
		String str4 ="visjay";
		String str5 = "c2ccccc";
		
		System.out.println(str4.compareTo(str5));// 0
		
		System.out.println(str1.compareTo(str2));// 0
		System.out.println(str1.compareTo(str3));// 1
		System.out.println(str3.compareTo(str1));// -1
	}
}