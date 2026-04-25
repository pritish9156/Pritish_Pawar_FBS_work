package tree;

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
		
		showData(root);
	}
	
	public void showData(Node root) {
		
		if(root==null) {
			return;
		}
		
		showData(root.getPrev());
		System.out.println(root.getData());
		showData(root.getNext());
	}
}
