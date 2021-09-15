package com.bridgelabz.OopsPractice;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList();
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		// TO REMOVE ELEMENT FROM QUEUE(FIFO)
		System.out.println(queue.poll());
		//CHECK LIST
		System.out.println(queue);
		// TO CHECK NEXT ELEMENT IN LINE FOR OUT
		System.out.println(queue.peek());
}
	
}