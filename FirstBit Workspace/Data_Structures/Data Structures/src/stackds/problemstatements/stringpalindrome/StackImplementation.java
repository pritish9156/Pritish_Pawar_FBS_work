package stackds.problemstatements.stringpalindrome;

import java.util.Scanner;
import stackds.problemstatements.equationbalanced.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter equation: ");
		String str = sc.nextLine();
		
		Stack stack = new Stack(str.length());
		
		
		
		sc.close();
	}
}
