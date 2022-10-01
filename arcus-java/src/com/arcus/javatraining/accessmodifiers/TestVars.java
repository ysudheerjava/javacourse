package com.arcus.javatraining.accessmodifiers;

public class TestVars {
	
	private int total=100;
	static int totalst=400;
	public int totals;
	
	public void getTotal() {
		int total=200;
	}
	
	private void getTotals() {
		int total=200;
	}
	
	protected void get_Total() {
		int total=200;
	}
	
	void getTotal2() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total =300;
		System.out.println(total);

	}

}
