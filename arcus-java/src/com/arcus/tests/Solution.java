package com.arcus.tests;

public class Solution{

public Boolean packageRice(Integer big, Integer small, Integer goal) {
	boolean result = false;
	if (big * 5 >= goal) {
	    if (small >= goal % 5)
	        result = true;
	} else {
	    if (small >= goal - big * 5) {
	        result = true;
	    }
	}
	return result;
}

public static void main(String args[]) {
	Solution s = new Solution();
	System.out.println(s.packageRice(1, 3, 7));
}
}