package tree.problemstatements.meetingbooking;

public class TreeDs {
	
	Node root;
	
	public TreeDs(){
		root=null;
	}

	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(int ele) {
		
		root = insertData(ele, root);
	}
	
	public Node insertData(int ele, Node temp) {
		
		if(temp==null) {
			return new Node(ele);
		}
		
		if(ele<temp.getData()) {
			
			temp.setPrev(insertData(ele, temp.getPrev()));
			
		}
		else if(ele>temp.getData()) {
			
			temp.setNext(insertData(ele, temp.getNext()));
		}
		
		return temp;
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("List is Empty....!");
			return;
		}
		
		InOrder(root);
	}
	
	public void InOrder(Node root) {
		
		if(root==null) {
			return;
		}
		
		InOrder(root.getPrev());
		System.out.println(root.getData());
		InOrder(root.getNext());
	}
	
	public void PreOrder(Node root) {
		
		if(root==null) {
			return;
		}
		
		System.out.println(root.getData());
		InOrder(root.getPrev());
		InOrder(root.getNext());
	}

	public void PostOrder(Node root) {
	
		if(root==null) {
			return;
		}
	
		InOrder(root.getPrev());
		InOrder(root.getNext());
		System.out.println(root.getData());
	}
	
	public void delete(int ele) {
		if(isEmpty()) {
			System.out.println("List is Empty...!");
			return;
		}
		
		root = deleteByElement(ele, root);
	}
	
	Node deleteByElement(int ele, Node temp){
		
		if(temp==null) {
			System.out.println("Element Not Found...!");
			return null;
		}
		
		if(ele<temp.getData()) {
			temp.setPrev(deleteByElement(ele, temp.getPrev()));
			return temp;
		}
		else if(ele>temp.getData()) {
			temp.setNext(deleteByElement(ele, temp.getNext()));
			return temp;
		}
		else {
			if(temp.getPrev()==null && temp.getNext()==null)
				return null;
			
			if(temp.getNext()==null) {
				return temp.getPrev();
			}
			
			if(temp.getPrev()==null)
				return temp.getNext();
			
			Node tp=temp.getNext();
			while(tp.getPrev()!=null)
				tp=tp.getPrev();
			
			temp.setData(tp.data);
			temp.setNext(deleteByElement(tp.getData(), temp.getNext()));
			
			return temp;
		}
	}
}
