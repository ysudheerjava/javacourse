package com.arcus.javatrainings.collections.list.stack;

import java.util.Stack;

public class StackExample {
	
	public static void main(String args[]) {
		
		Stack stack = new Stack();
		stack.push("Dog"); //Bottom of the stack
		stack.push("Cat");
		stack.push("Cow"); //top of the stack
		stack.push("Rat"); //top of the stack
		
		System.out.println(stack);
		stack.pop();
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.search("Dog"));
		System.out.println(stack.search("Cat"));
		System.out.println(stack.search("Cow"));
		System.out.println(stack.search("Monkey"));
		System.out.println(stack.peek());//returns the element on top of the stack
		
		
		
		
		
		
	
	
	
	}
	

}
