package linkedlist.singlylinkedlist.problemstatement.stackusinglinkedlist;

import java.util.Scanner;

public class LinkedListStackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedListStack lls = new LinkedListStack();
		
		int choice;
		
		System.out.println("\tStack - using linked List");
		
		do {
			
			System.out.println("\n1.push\n2.pop\n3.peek\n4.fetch total size\n5.display\n6.exit");
			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("\nEnter Element to push");
					int ele = sc.nextInt();
					lls.push(ele);
					break;
				}
				case 2:{
					lls.pop();
					break;
				}
				case 3:{
					lls.peek();
					break;
				}
				case 4:{
					System.out.println("\nTotal size: " + lls.getCount()+"\n");
					break;
				}
				case 5:{
					lls.display();
					break;
				}

				case 6:{
					System.out.println("Exited..!");
					break;
				}
			}
			
		}while(choice!=6);

		sc.close();
	}

}
