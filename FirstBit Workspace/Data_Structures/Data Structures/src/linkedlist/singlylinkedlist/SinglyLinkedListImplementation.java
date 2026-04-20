package linkedlist.singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedListImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		int choice;
		
		do {
			System.out.println("\t\n----Linked List Data Structure----");
			System.out.println("\n1.insert element\n2.insert At Beginning\n3.insert At position\n4.display\n5.delete Element\n6.delete From begining\n7.delete from end\n8.Sort the list\n9.display In Reverse Order\n10.Total size of list\n11.Delete using position\n12.Exit");
			System.out.println("\nEnter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:{
					System.out.println("\nEnter number to insert: ");
					int ele = sc.nextInt();
					ll.insert(ele);
					break;
				}
				
				case 2:{
					System.out.println("\nEnter number to insert: ");
					int ele = sc.nextInt();
					ll.insertAtBeg(ele);
					break;
				}
				
				case 3:{
					System.out.println("\nEnter number to insert: ");
					int ele = sc.nextInt();
					System.out.println("\nEnter position: ");
					int position = sc.nextInt();
					ll.insertAtPosition(ele, position);
					break;
				}
				
				case 4:{
					System.out.println();
					ll.display();
					break;
				}
				case 5:{
					System.out.println("\nEnter Element to delete: ");
					int element = sc.nextInt();
					ll.deleteElement(element);
					break;
				}
				case 6:{
					ll.deleteFromBeg();
					break;
				}
				case 7:{
					ll.deleteFromEnd();
					break;
				}
				case 8:{
					ll.bubbleSort();
					break;
				}
				case 9:{
					System.out.println("\nDisplying in reverse order\n");
//					ll.displayInReverseOrder();
					ll.displayReverseRecurion();
					break;
				}
				case 10:{
					System.out.println("\nTotal size of the List: " + ll.getCount() +"\n");
					break;
				}
				case 11:{
					System.out.println("\nEnter position to delete: ");
					int position = sc.nextInt();
					ll.deleteFromPosition(position);
					break;
				}
				case 12:{
					System.out.println("\nExited Successfully..!");
					break;
				}
			}
		
		}while(choice!=12);
		
		sc.close();	
	}
}
