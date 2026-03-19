package StackandQueue;

import java.util.LinkedList;

public class TestLinkedListStackAndQueue {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		//Stack - recent data LIFO
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		
//		l1.addLast(1);
//		l1.addLast(2);
//		l1.addLast(3);
//		l1.addLast(4);
//		
//		System.out.println(l1);
//		l1.removeLast();
//		System.out.println(l1);
		
		
		//Queue - oldest data FIFO
		
		LinkedList l2 = new LinkedList();
		
		System.out.println("\nQueue");
		
		l2.addFirst(1);
		l2.addFirst(2);
		l2.addFirst(3);
		l2.addFirst(4);
		
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);

	}

}
