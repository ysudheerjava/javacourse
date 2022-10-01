package com.arcus.tests;



public class AgesScanner {

	public static void main(String args[]) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		String mycompany = args[0];
		String mycompany2 = args[1];
		
		String str = "str";
		Double d = 10.0;
		Integer c=20;
		
		byte b=1;
		short sh=2;
		int in=3;
		long lo=444444444;
		float fl=0.3f;
		
		System.out.println(b+sh);
		
		
		
		System.out.println(d+c);
		
	
		int a[] = new int[10];
		
		a[0]=1;
		

		int persons[] = {10, 20, 30, 40, 15, 8, 50, 60 };

		int childcount = 0;
		int adultcount = 0;

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] >= 0 && persons[i] <= 15) {
				childcount++;

			} else if (persons[i] >= 16) {
				adultcount++;

			}
		}
		System.out.println("Children: " + childcount);
		System.out.println("Adults: " + adultcount);

	}

}