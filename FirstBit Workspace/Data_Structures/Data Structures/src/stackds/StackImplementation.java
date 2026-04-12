package stackds;

import java.util.Scanner;

public class StackImplementation {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
		
			switch(choice) {
				case 1:{
					System.out.println("\nEnter number to push: ");
					int numToPush = sc.nextInt();
					stack.push(numToPush);
					break;
				}
				case 2:{
					stack.pop();
					break;
				}
				case 3:{
					System.out.println(stack.peek());
					break;
				}
				case 4:{
					stack.display();
					break;
				}
				case 5:{
					System.out.println("Exited");
					break;
				}
				default:{
					System.out.println("\nWrong choice -- try again");
				}
			}
		}while(choice!=5);
	}
}
