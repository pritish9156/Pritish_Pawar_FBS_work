package linkedlist.singlylinkedlist;

public class LinkedList {

	Node start;
	int count;
	
	public LinkedList(){
		start = null;
		count = 0;
	}
	
	public boolean isEmpty() {
		if(start==null) 
			return true;
		else
			return false;
	}
	
	public void insert(int element) {
		
		Node node = new Node(element);
		
		if(isEmpty())
			start = node;
		else {
			Node currNode = start;
			
			while(currNode.getNext()!=null)
				currNode = currNode.getNext();
			
			currNode.setNext(node);
		}
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		Node currNode = start;
		
		while(currNode != null) {
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
	}
}
