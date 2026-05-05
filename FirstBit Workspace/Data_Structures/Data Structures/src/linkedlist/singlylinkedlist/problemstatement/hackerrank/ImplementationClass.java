package linkedlist.singlylinkedlist.problemstatement.hackerrank;
import java.util.LinkedList;

public class ImplementationClass {
		
	public static void main(String[] args) {
			
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
			
		//add elements in l1
		l1.add(10);
		l1.add(20);
		l1.add(30);
			
		//add elements in l2
		l2.add(10);
		l2.add(20);
		l2.add(30);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println();
		System.out.println(InbuiltLinkCmpLenAndData(l1,l2));
		
	}
	
	static boolean InbuiltLinkCmpLenAndData(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
		if(l1.isEmpty() || l2.isEmpty()) {
			System.out.println("List is Empty...!");
			return false;
		}
		
		if(l1.size()!=l2.size()) {
			System.out.println("Both Lists are not identical");
			return false;
		}
		
		boolean flag=true;
		
		for(int i=0; i<l1.size(); i++) {
			if(l1.get(i)!=l2.get(i)) {
				flag=false;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("Both Lists are identical");
			return true;
		}else {
			System.out.println("Data mismatch");
			return false;
		}
		
	}

}


