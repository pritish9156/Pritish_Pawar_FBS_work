package linkedlist.circularlinkedlist;

public class CircularLinkedList {

	Node start;
	Node end;
	int count;
	
	public CircularLinkedList() {
		super();
		this.start = null;
		this.end = null;
		this.count = 0;
	}
	
	
	public boolean isEmpty() {
		if(start==null && end==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertByPosition(int ele, int position) {
		
		if(position<=0 || position>count+1) {
			System.out.println("Invalid position");
			return;
		}
		
		Node newNode = new Node(ele);
		
		if(isEmpty() && position==1) {
			start = newNode;
			end = newNode;
			
			start.setNext(start);
			count++;
			return;
		}
		
		if(position==1) {
			newNode.setNext(start);
			start=newNode;
			end.setNext(start);
			count++;
			return;
		}
		
		int c=1;
		Node p=start;
		
		while(c<position-1) {
			p = p.getNext();
			c++;
		}
		
		newNode.setNext(p.getNext());
		p.setNext(newNode);
		if(p==end) {
			end=newNode;
		}
		count++;
		
	}
	
	public void deleteByPosition(int position) {
		if(isEmpty()) {
			System.out.println("List is Empty...!");
			return;
		}
		
		if(position<=0 || position>count) {
			System.out.println("Invalid position");
			return;
		}
		
		if(position==1) {
			if(start==end) {
				start=null;
				end=null;
				count--;
				return;
			}
			
			start=start.getNext();
			end.setNext(start);
			count--;
			return;
		}
		
		Node p = start;
		int c=1;
		
		while(c<position-1) {
			p=p.getNext();
			c++;
		}
		
		if(p.getNext()==end) {
			end=p;
		}
		
		p.setNext(p.getNext().getNext());
		
		count--;
	}

	public int getCount() {
		return count;
	}
	
	
}
