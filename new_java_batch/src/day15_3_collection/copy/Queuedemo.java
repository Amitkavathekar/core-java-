package day15_3_collection.copy;

import java.util.PriorityQueue;
import java.util.Queue;

import day11_1interface.mainapp;

public class Queuedemo{
	public static void main(String[] args) {
		Queue q = new PriorityQueue<>();
		
		q.add(34);
		q.offer(45);
		q.offer(87);
		q.add(97);
		
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		
		
	}
}

