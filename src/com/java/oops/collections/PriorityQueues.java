package com.java.oops.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {

		Comparator<Object> reverseOrder = Collections.reverseOrder();
		
		PriorityQueue<Integer> pqMinHeap = new PriorityQueue();// Min Heap
		PriorityQueue<Integer> pqMax = new PriorityQueue(Collections.reverseOrder());// Max Heap
		pqMinHeap.add(4);
		pqMinHeap.add(-4);
		pqMinHeap.add(44);
		pqMinHeap.add(41);
		pqMinHeap.add(40);
		pqMinHeap.add(3);
		
		pqMax.add(4);
		pqMax.add(7);
		pqMax.add(7);
		pqMax.add(44);
		pqMax.add(44);
		pqMax.add(17);
		pqMax.add(-7);
		pqMax.add(67);
		
		
		
		System.out.println(pqMinHeap);
		System.out.println(pqMinHeap.peek());
		System.out.println(pqMinHeap.poll());
		System.out.println(pqMinHeap);
		
		System.out.println(pqMax);
		System.out.println(pqMax.poll());//67
		System.out.println(pqMax.poll());//44
		System.out.println(pqMax.poll());//44
		System.out.println(pqMax);
		
		

	}

}
