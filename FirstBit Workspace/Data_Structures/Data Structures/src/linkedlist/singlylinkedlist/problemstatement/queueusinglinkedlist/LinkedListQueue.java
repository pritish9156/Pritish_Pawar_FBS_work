package linkedlist.singlylinkedlist.problemstatement.queueusinglinkedlist;

public class LinkedListQueue {

	Node front, rear;
	
	public LinkedListQueue(){
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		if(front==null && rear==null)
			return true;
		else
			return false;
	}
	
	public void enqueue(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			return;
		}
		
		rear.setNext(newNode);
		rear = newNode;
		
	}
	
	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("\nQueue is Empty...!\n");
			return;
		}
		
		front = front.getNext();
		
		if(front==null)
			rear=null;
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("\nQueue is Empty...!\n");
			return;
		}
		
		Node p = front;
		
		System.out.print("[");
		
		while(p!=null) {
			if(p.getNext()==null)
				System.out.print(p.getData() + "]\n");
			else
				System.out.print(p.getData() + ", ");
			
			p = p.getNext();
		}
	}
}
