package queue.simplequeue;

public class SimpleQueue {
	
	int[] arr;
	int front, rear;
	
	public SimpleQueue(int size) {
		arr = new int[size];
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
	
	public void enqueue(int ele) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		
		if(isEmpty()) {
			front++;
		}

		arr[++rear]=ele;
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
