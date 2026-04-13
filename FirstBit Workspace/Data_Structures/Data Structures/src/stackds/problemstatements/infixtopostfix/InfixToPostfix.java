package stackds.problemstatements.infixtopostfix;

import java.util.HashMap;
import java.util.Scanner;
import stackds.problemstatements.equationbalanced.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter equation: ");
		String equation = sc.nextLine();
		
		String postFix = "";
		
		//Priority 
		HashMap<Character, Integer> priority = new HashMap<>();
		
		priority.put(Character.valueOf('+'), Integer.valueOf(1));
		priority.put(Character.valueOf('-'), Integer.valueOf(1));
		priority.put(Character.valueOf('/'), Integer.valueOf(2));
		priority.put(Character.valueOf('*'), Integer.valueOf(2));
		
		Stack stack = new Stack(equation.length());
		
		//A+b*c
	
		for(int i=0; i<equation.length(); i++) {
			if(equation.charAt(i)=='+' || equation.charAt(i)=='-' || 
					equation.charAt(i)=='*' || equation.charAt(i)=='/' 
					|| equation.charAt(i)=='(' || equation.charAt(i)==')') {
				
//				System.out.println(priority.get(equation.charAt(i)));
//				System.out.println(priority.get(stack.peek()));

				if(stack.peek()!='(' && stack.peek()!=')' && equation.charAt(i)!='(' && equation.charAt(i)!=')') {
					while(!stack.isEmpty() && priority.get(equation.charAt(i)) <= priority.get(stack.peek())) {
						postFix += stack.peek(); 
						stack.pop();
					}
				}
				
				if(equation.charAt(i)==')') {
					while(stack.peek()!='(') {
						postFix += stack.peek(); 
						stack.pop();
					}
					stack.pop();
				}else
					stack.push(equation.charAt(i));
//				stack.display();
			
			}else
				postFix += equation.charAt(i);
		}
		
		while(!stack.isEmpty()) {
			postFix += stack.peek();
			stack.pop();
		}
		
		System.out.println("postFix: " + postFix);
	}

}
