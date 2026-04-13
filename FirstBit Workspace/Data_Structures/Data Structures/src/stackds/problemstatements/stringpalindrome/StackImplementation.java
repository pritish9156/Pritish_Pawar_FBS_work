package stackds.problemstatements.stringpalindrome;

import java.util.Scanner;
import stackds.problemstatements.equationbalanced.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = sc.nextLine().toLowerCase().replace(" ", "");
		
		if(str.length()!=0) {
			
			Stack stack = new Stack(str.length());
			
			for(int i=0; i<str.length(); i++)
				stack.push(str.charAt(i));
	
			for(int i=0; i<str.length(); i++) {
				if(!stack.isEmpty() && str.charAt(i)==stack.peek())
					stack.pop();
				else 
					break;
			}
		
			if(stack.isEmpty())
				System.out.println("String is palindrome");
			else
				System.out.println("String is not palindrome");
			
		}else {
			System.out.println("Please enter some string to check");
		}
		
		sc.close();
	}
}
