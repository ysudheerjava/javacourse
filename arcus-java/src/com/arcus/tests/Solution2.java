package com.arcus.tests;

public class Solution2 {

	public String sampleSugarBag(Integer heavy, Integer light, Integer sample) {
		String result = "Not Possible";
		
		if (heavy * 5 >= sample) {
			if (light >= sample % 5)
				result = "Possible";
		} 
		else {
			if (light >= sample - heavy * 5) {
				result = "Possible";
			}
		}
		return result;
	}

	
	public static String sampleSugarBag1(Integer heavy, Integer light, Integer sample) {
		String result = "Not Possible";
		
		int totalHeavyBags= 5*heavy;
		int totalLightBags=1*light;
		int total = totalHeavyBags+totalLightBags;
		if (sample<=total) {
			return "Possible";
		}
		return result;
	}
	public static void main(String args[]) {
		//Solution2 s = new Solution2();
		//System.out.println(s.sampleSugarBag(1, 3, 9));
		System.out.println(sampleSugarBag1(1, 3, 9));

	}
}