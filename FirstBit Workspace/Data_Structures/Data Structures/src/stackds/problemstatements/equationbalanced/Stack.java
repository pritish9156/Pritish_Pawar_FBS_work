package stackds.problemstatements.equationbalanced;

public class Stack {

	char[] arr;
	int top;
	
	public Stack(int arrSize){
		arr = new char[arrSize];
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
	
	public void push(char numToPush) {
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
			top--;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			return '\0';
		}else {
			return arr[top];
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

	
//	public String toString() {
//		int[] array = Arrays.copyOfRange(arr, 0, top+1);
//		return "Stack [arr=" + Arrays.toString(array) + "]";
//	}
	
}
