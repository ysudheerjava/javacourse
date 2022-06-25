package com.arcus.javatraining.inheritance;

public class MultiLevelExample extends SubClassExample{
	
	public static void main(String args[]) 
	{
		MultiLevelExample myInstance = new MultiLevelExample();
		
		int myNumber = myInstance.displayNumber(70);
		
		System.out.println(myNumber);
	}

}
