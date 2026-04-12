package stackds;

import java.util.Arrays;

public class Stack {

	int[] arr;
	int top;
	
	Stack(int arrSize){
		arr = new int[arrSize];
		top = -1;
	}
	
	public boolean isFull() {
		if(top==arr.length-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void push(int numToPush) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}else {
			top++;
			arr[top]=numToPush;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}else {
			System.out.println(arr[top] + " removed");
			top--;
		}
	}
	
	public String peek() {
		if(isEmpty()) {
			return "stack is empty";
		}else {
			return Integer.toString(arr[top]);
		}
	}
	
	public void display() {
		if(!isEmpty()){
			int temp = top;
			System.out.print("[");
			while(temp!=-1) {
				if(temp==0)
					System.out.println(arr[temp] + "]");
				else
					System.out.print(arr[temp] + ",");
				
				temp--;
			}
		}else {
			System.out.println("stack is empty");
		}
	}

	@Override
	public String toString() {
		int[] array = Arrays.copyOfRange(arr, 0, top+1);
		return "Stack [arr=" + Arrays.toString(array) + "]";
	}
	
}
