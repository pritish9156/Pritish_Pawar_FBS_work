package linkedlist.singlylinkedlist.problemstatement.stackusinglinkedlist;

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
		
		if(isEmpty()) {
			start = node;
			count++;
		}
		else {
			Node currNode = start;
			
			while(currNode.getNext()!=null)
				currNode = currNode.getNext();
			
			currNode.setNext(node);
			count++;
		}
	}
	
	//insert at beginning
	public void insertAtBeg(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start = newNode;
			count++;
			return;
		}
		
		newNode.setNext(start);
		start = newNode;
		count++;
	}
	
	//insert at required position
	public void insertAtPosition(int ele, int position) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			if(position==1) {
				start=newNode;
				count++;
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
			count++;
			
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
			count--;
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
			count--;
			return;
		}
		
		while(p.getNext().getNext()!=null) {
			p=p.getNext();
		}
		
		p.setNext(null);
		count--;
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
			count--;
		}
	}
	
	//delete by using position
	public void deleteFromPosition(int position) {
		
		if(isEmpty()) {
			System.out.println("\nList is Empty..!\n");
			return;
		}
		
		if(position<=0 || position>count) {
			System.out.println("Invalid position");
			return;
		}
		
		if(position==1) {
			deleteFromBeg();
			return;
		}
		
		Node p=start;
		int c=1;
		
		while(c<position-1) {
			p=p.getNext();
			c++;
		}
		
		p.setNext(p.getNext().getNext());
		count--;
		
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
	
	public void displayReverseRecurion() {
		displayReverseUsingRecursion(start);
	}
	
	//display reverse using recursion
	public void displayReverseUsingRecursion(Node p) {
		
		if(p!=null) {
			displayReverseUsingRecursion(p.getNext());
			System.out.println("\n"+p.getData());
		}
	}
	
	//sorting the list using bubbleSort
	public void bubbleSort() {
		
		boolean swap = false;
		
		for(Node i=start; i!=null; i=i.getNext()) {
			for(Node j=start; j.getNext()!=null; j=j.getNext()) {
				if(j.getData()>j.getNext().getData()) {
					int temp = j.getData();
					j.setData(j.getNext().getData());
					j.getNext().setData(temp);
					swap=true;
				}
			}
			
			if(swap==false)
				return;
		}
	}
	
	
	public void displayInReverseOrder() {
		
		int count=0;
		
		Node k=start;
		
		while(k!=null) {
			count++;
			k=k.getNext();
		}
		
		int[] arr = new int[count];
		
		Node p=start;

		int j=0;
		
		while(p!=null) {
			arr[j] = p.getData();
			j++;
			p = p.getNext();
		}
		
		System.out.print("[");
		for(int i=arr.length-1; i>=0; i--) {
			if(i==0)
				System.out.println(arr[i] + "]\n");
			else
			System.out.print(arr[i] + ", ");
		}
	}

	//get total length of the list
	public int getCount() {
		return count;
	}
	
}
