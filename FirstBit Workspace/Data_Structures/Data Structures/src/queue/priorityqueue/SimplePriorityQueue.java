package queue.priorityqueue;

public class SimplePriorityQueue {
	
	String[] arr;
	int front, rear;
	
	public SimplePriorityQueue(int size) {
		arr = new String[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		if(rear==-1) return true;
		else return false;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1) return true;
		else return false;
	}
	
	public void enqueue(String ele) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		
		if(isEmpty()) {
			front++;
			rear++;
			arr[rear]=ele;
			return;
		}
		
		int i=rear;
		while(i>=0 && ele.compareToIgnoreCase(arr[i])<0) {
			arr[i+1]=arr[i];
			i--;
		}

		arr[i+1]=ele;
		rear++;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else
			front++;
			
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		System.out.print("[");
		for(int i=front; i<=rear; i++) {
			if(i==rear)
				System.out.print(arr[i]+"]\n");
			else
			System.out.print(arr[i]+", ");
		}
	}
	
}
