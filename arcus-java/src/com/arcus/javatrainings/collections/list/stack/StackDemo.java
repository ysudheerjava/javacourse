package com.arcus.javatrainings.collections.list.stack;

import java.util.Stack;

//Last in first out

// Stack is a subclass of Vector

//push() -- inserting the element on top of the stack
//pop() -- removing the element from stack, last element will be removed always
//peek() -- returns the top of the element 

//search()

public class StackDemo {

	public static void main(String args[]) {

		Stack<String> bookStack = new Stack<>();
		bookStack.push("Java");
		bookStack.push("Python");
		bookStack.push("C");

		System.out.println(bookStack);

		bookStack.pop(); // removes the last element or top element from the stack

		System.out.println(bookStack);

		System.out.println(bookStack.peek());

	}

}
