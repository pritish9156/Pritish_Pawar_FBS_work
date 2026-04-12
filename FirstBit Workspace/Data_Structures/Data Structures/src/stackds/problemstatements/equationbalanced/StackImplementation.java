package stackds.problemstatements.equationbalanced;
import java.util.Scanner;

import stackds.problemstatements.equationbalanced.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean equCheck=true;
		
		System.out.print("Enter equation: ");
		String equation = sc.nextLine();
		
		Stack stack = new Stack(equation.length());
		
		for(int i=0; i<equation.length(); i++) {
			char ch = equation.charAt(i);
			
			if(ch=='{' || ch=='(' || ch=='[') {
				stack.push(ch);
			}
				
			if(ch=='}' || ch==')' || ch==']') {
				if(ch=='}' && stack.peek()=='{')
					stack.pop();
				else if(ch==')' && stack.peek()=='(')
					stack.pop();
				else if(ch==']' && stack.peek()=='[')
					stack.pop();
				else {
					System.out.println("Equation is imbalanced");
					equCheck=false;
					break;
				}
			}
		}
		
		if(stack.isEmpty() && equCheck==true)
			System.out.println("Equation is balanced");
		
		sc.close();
	}
}
