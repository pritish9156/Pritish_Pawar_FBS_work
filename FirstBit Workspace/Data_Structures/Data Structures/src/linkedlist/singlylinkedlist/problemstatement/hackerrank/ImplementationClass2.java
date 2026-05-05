package linkedlist.singlylinkedlist.problemstatement.hackerrank;

public class ImplementationClass2 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		//add elements in l1
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		
		//add elements in l2
		l2.insert(10);
		l2.insert(25);
		l2.insert(30);
		
		l1.display();
		l2.display();
		
		System.out.println(LinkedList.compareListLenAndData(l1, l2));
	}

}


