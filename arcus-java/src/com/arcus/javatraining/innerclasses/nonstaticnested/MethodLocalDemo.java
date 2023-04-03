package com.arcus.javatraining.innerclasses.nonstaticnested;

class MethodLocalDemo {
	
	public void methodOne() {
		
		class Inner {
			public void sum(int i, int j) {
				System.out.println("The sum:" + (i + j));
			}
		}
		
		Inner i = new Inner();
	
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
		
	}
	public static void main(String[] args) {
		new MethodLocalDemo().methodOne();
	}
}