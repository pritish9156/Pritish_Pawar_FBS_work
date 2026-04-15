package queue.priorityqueue;

import java.util.Scanner;

public class SimplePriorityQueueImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you want to store: ");
		int arrSize = sc.nextInt();
		
		SimplePriorityQueue queue = new SimplePriorityQueue(arrSize);
		int choice;

		
		do {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					
					System.out.println("\nEnter a number to insert: ");
					sc.nextLine();
					String numToEnqueue = sc.nextLine();
					queue.enqueue(numToEnqueue);
					break;
					
				}
				case 2:{
					
					queue.dequeue();
					break;
					
				}
				case 3:{
					
					queue.display();
					break;
					
				}
				case 4:{
					System.out.println("Exited...!");
					break;
				}
			}
		}while(choice!=4);
	}

}
