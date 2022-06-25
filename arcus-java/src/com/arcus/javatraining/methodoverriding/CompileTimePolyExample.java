package com.arcus.javatraining.methodoverriding;

public class CompileTimePolyExample {

	
	public void addNum() {}
	
	public void addNum(int i, int j) {}
	
	public void addNum(int i, int j, int k) {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CompileTimePolyExample comp = new CompileTimePolyExample();
	//comp.addNum(1,2,3,4);
	comp.addNum(1,2);
	}

}
