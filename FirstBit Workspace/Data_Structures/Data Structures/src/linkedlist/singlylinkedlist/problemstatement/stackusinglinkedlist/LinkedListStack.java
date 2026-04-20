package linkedlist.singlylinkedlist.problemstatement.stackusinglinkedlist;

public class LinkedListStack {
	
	Node top;
	int count;
	
	LinkedListStack(){
		top = null;
		count = 0;
	}
	
	public boolean isEmpty() {
		if(top==null)
			return true;
		else
			return false;
	}

	public void push(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			top = newNode;
			count++;
			return;
		}
		
		newNode.setNext(top);
		top = newNode;
		count++;
	}
	
	public void pop() {
		
		if(isEmpty()) {
			System.out.println("\nStack is Empty....!\n");
			return;
		}
		
		System.out.println("\n"+top.getData()+" poped\n");
		top = top.getNext();
		count--;
		
	}
	
	public void peek() {
		
		if(isEmpty()) {
			System.out.println("\nStack is Empty....!\n");
			return;
		}
		
		System.out.println("\n"+top.getData()+"\n");
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("\nStack is Empty....!\n");
			return;
		}
		
		System.out.print("\nTop-> [");
		Node p = top;
		
		while(p!=null) {
			if(p.getNext()==null)
				System.out.println(p.getData()+"]\n");
			else
				System.out.print(p.getData()+", ");
			
			p=p.getNext();
		}
	}

	public int getCount() {
		return count;
	}
	
}
