package com.bridgelabz.OopsPractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer>pq= new PriorityQueue();
pq.offer(40);
pq.offer(12);
pq.offer(24);
pq.offer(36);
System.out.println(pq);
//to remove
pq.poll();
System.out.println(pq);
//to make a min heap use priority queue directly
System.out.println(pq.peek());
	}

}
