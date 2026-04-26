package linkedlist.doublylinkedlist;

class DoublyLinkedList{
	
	Node start;
	int count;
	
	DoublyLinkedList(){
		start=null;
		count=0;
	}

	public int getCount() {
		return count;
	}
	
	public boolean isEmpty() {
		if(start==null) 
			return true;
		else
			return false;
	}
	
	public void insert(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start=newNode;
			count++;
			return;
		}
		
		Node p = start;
		
		while(p.getNext()!=null) {
			p=p.getNext();
		}
		
		p.setNext(newNode);
		newNode.setPrev(p);
		count++;
		
	}
	
	public void sortedInsertFromFront(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start = newNode;
			count++;
			return;
		}
		
		Node p = start;
		
		while(p.getNext()!=null && p.getData()<ele) {
			p=p.getNext();
		}
		
		System.out.println();
		System.out.println("current p: on : " + p.getData());
		System.out.println();
		
		if(p==start && p.getData()>ele) {
			newNode.setNext(p);
			p.setPrev(newNode);
			start = newNode;
			count++;
			return;
		}
		else if(p.getNext()==null && p.getData()<ele) {
			p.setNext(newNode);
			newNode.setPrev(p);
			count++;
			return;
		}
		else {
			newNode.setNext(p);
			newNode.setPrev(p.getPrev());
			p.getPrev().setNext(newNode);
			p.setPrev(newNode);
		}
		
		count++;
	}
	
	public void sortedInsertFromReverse(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start=newNode;
			count++;
			return;
		}
		
		Node p = start;
		
		while(p.getNext()!=null) {
			p=p.getNext();
		}
		
		System.out.println();
		System.out.println("current p: end : " + p.getData());
		System.out.println();
		
		while(p.getPrev()!=null && ele<p.getData()) {
			p=p.getPrev();
		}
		
		System.out.println();
		System.out.println("current p: on : " + p.getData());
		System.out.println();
		
		if(p.getNext()==null && p.getData()<ele) {
			newNode.setPrev(p);
			p.setNext(newNode);
			count++;
			return;
		}
		else if(p.getPrev()==null && p.getData()>ele) {
			newNode.setNext(p);
			p.setPrev(newNode);
			start=newNode;
			count++;
			return;
		}
		else {
			newNode.setNext(p.getNext());
			newNode.setPrev(p);
			p.getNext().setPrev(newNode);
			p.setNext(newNode);
		}
		
		count++;

	}
	
	public void insertAtBeg(int ele) {
		
		Node newNode = new Node(ele);
		
		if(isEmpty()) {
			start=newNode;
			count++;
			return;
		}
		
		start.setPrev(newNode);
		newNode.setNext(start);
		start = newNode;
		count++;
	}
	
	public void insertAtPosition(int ele, int position) {
		
		if(position<=0 || position>count+1) {
			System.out.println("position is invalid...!");
			return;
		}
		
		Node newNode = new Node(ele);
		
		if(position==1) {
			insertAtBeg(ele);	
			return;
		}
		
		Node p=start;
		int c=1;
		
		while(c<position && p.getNext()!=null) {
			p=p.getNext();
			c++;
		}
		
		if(c==position-1) {
			p.setNext(newNode);
			newNode.setPrev(p);
			count++;
			return;
		}
		
		newNode.setPrev(p.getPrev());
		newNode.setNext(p);
		p.getPrev().setNext(newNode);
		p.setPrev(newNode);
		
		count++;
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("List is Empty...!");
			return;
		}
		
		Node p=start;
		
		System.out.print("[");
		while(p!=null) {
			if(p.getNext()==null) {
				System.out.print(p.getData()+"]");
			}else {
				System.out.print(p.getData()+", ");
			}
			p=p.getNext();
		}
		
	}
	
	public void deleteFromBeg() {
		
	}
	
	public void deleteFromEnd() {
		
	}
	
	public void deleteByPosition(int position) {

		if(isEmpty()) {
			System.out.println("List is Empty...!");
			return;
		}
		
		if(position<=0 || position>count) {
			System.out.println("invlid count....!");
			return;
		}
		
		if(position==1) {
			if(count==1) {
				start=null;
				count--;
				return;
			}
			
			start=start.getNext();
			start.setPrev(null);
			count--;
			return;
		}
		
		Node p=start;
		int c=1;
		
		while(c<position) {
			p=p.getNext();
			c++;
		}

		p.getPrev().setNext(p.getNext());
		
		if(p.getNext()!=null)
			p.getNext().setPrev(p.getPrev());
		
		count--;
	}
	
	public void deleteElement(int ele) {
		
	}
}