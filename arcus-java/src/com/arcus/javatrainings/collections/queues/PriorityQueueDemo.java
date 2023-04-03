package com.arcus.javatrainings.collections.queues;
// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class PriorityQueueDemo {
	
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(100);
		pQueue.offer(100);
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		

		
		System.out.println(pQueue.element());
		
		System.out.println(pQueue.remove());
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());
		
		PriorityQueue<String> pQueueS = new PriorityQueue<String>();

		// Adding items to the pQueue using add()
		pQueueS.add("A");
		pQueueS.add("B");
		pQueueS.add("C");

		// Printing the top element of PriorityQueue
		System.out.println(pQueueS.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueueS.poll());

		// Printing the top element again
		System.out.println(pQueueS.peek());
	}
}
