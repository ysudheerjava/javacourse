package com.arcus.tests;

public class JavaChallenge {

	public static String sampleSugarBag(Integer heavy_bags, Integer light_bags, Integer sample) {

		String result = "Not Possible";

		int total_heavy = heavy_bags * 5;
		int total_light = heavy_bags * 1;

		int total_quantity = total_heavy + total_light;

		// Now check if the a sample can be made using total_quantity

		if (sample <= total_quantity) {
			result = "Possible";
		}

		return result;

	}

	public static void main(String[] args) {

		System.out.println(sampleSugarBag(1, 3, 8));
		System.out.println(sampleSugarBag(2, 1, 20));
		System.out.println(sampleSugarBag(4, 3, 20));

	}

}
