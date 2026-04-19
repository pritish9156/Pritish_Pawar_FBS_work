package linkedlist.singlylinkedlist;

public class LinkedList {

	Node start;
	int count;
	
	public LinkedList(){
		start = null;
		count = 0;
	}
	
	//checks for list emptiness helping function
	public boolean isEmpty() {
		if(start==null) 
			return true;
		else
			return false;
	}
	
	//normal insert at and
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
	
	//insert at beginning
	public void insertAtBeg(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start = newNode;
		}
		
		newNode.setNext(start);
		start = newNode;
	}
	
	//insert at required position
	public void insertAtPosition(int ele, int position) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			if(position==1) {
				start=newNode;
				return;
			}
			else {
				System.out.println("\nList is Empty cant enter to "+position+"th position\n");
				return;
			}
		}
		
		if(position==1) {
			insertAtBeg(ele);
			return;
		}
		
		Node p=start;
		int count=1;
		
		while(p.getNext()!=null && count<(position-1)) {
			p = p.getNext();
			count++;
		}
		
		if(count==(position-1)) {
			
			newNode.setNext(p.getNext());
			p.setNext(newNode);
			
		}else {
			System.out.println("\nEntered position is not valid for the present list\n");
		}
	}
	
	//delete From Beginning 
	public void deleteFromBeg() {
		if(isEmpty()) {
			System.out.println("\nList is Empty..!\n");
		}
		else {
			start=start.getNext();
		}
	}
	
	//delete from end
	public void deleteFromEnd() {
		if(isEmpty()) {
			System.out.println("\nList is Empty..!\n");
			return;
		}
		
		Node p=start;
		
		if(p.getNext()==null) {
			start=null;
			return;
		}
		
		while(p.getNext().getNext()!=null) {
			p=p.getNext();
		}
		
		p.setNext(null);
	}
	
	//delete by entering element to match in a list to delete 
	//delete the matching element at first occurrence
	public void deleteElement(int ele) {
		
		if(isEmpty()) {	
			System.out.println("\nList is Empty..!");
			return;
		}
		
		if(start.getData()==ele) {
			deleteFromBeg();
			return;
		}
		
		Node p=start;
		
		while(p.getNext()!=null && p.getNext().getData()!=ele) {
			p = p.getNext();
		}
		
		if(p.getNext()==null)
			System.out.println("\nElement Not found...!");
		else {
			p.setNext(p.getNext().getNext());
		}
	}
	
	//displays element from the list
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		Node currNode = start;
		
		System.out.print("Start-> [");
		while(currNode != null) {
			if(currNode.getNext() != null) 
				System.out.print(currNode.getData() + ", ");		
			else
				System.out.print(currNode.getData() + "] <-End\n\n");
			
			currNode = currNode.getNext();
		}
	}
}
