package linkedlist.singlylinkedlist.problemstatement.queueusinglinkedlist;

import java.util.Scanner;

public class LinkedListQueueImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedListQueue llq = new LinkedListQueue();
		int choice;
		
		do {
			System.out.println("\t\n----Queue using Linked List----");
			System.out.println("\n1.enqueue\n2.dequeue\n3.display\n4.Exit");
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("\nEnter number to insert: ");
					int ele = sc.nextInt();
					llq.enqueue(ele);
					break;
				}
				case 2:{
					llq.dequeue();
					break;
				}
				case 3:{
					System.out.println();
					llq.display();
					break;
				}	
				case 4:{
					System.out.println("\nExited Successfully..!");
					break;
				}
			}
		
		}while(choice!=4);
		
		sc.close();	
	}
}
