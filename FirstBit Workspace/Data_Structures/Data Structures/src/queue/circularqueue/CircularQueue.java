package queue.circularqueue;

public class CircularQueue {
	
	int[] arr;
	int front, rear;
	
	public CircularQueue(int size){
		arr = new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		if(rear==-1 && front==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(front==rear)
			return true;
		else
			return false;
	}
	
	public void enqueue(int ele) {
		
		if(isEmpty()) {
			front++;
			rear++;
		}
		
		if(front!=0 && isFull()) {
			System.out.println("Full");
			return;
		}
			
		if(rear==arr.length && front!=0)
			rear=0;

		if(front!=0 && isFull() || rear==arr.length) {
			System.out.println("Full");
			return;
		}
		
		arr[rear]=ele;
		rear++;
		
	}
	
	public void dequeue() {
		if(front==arr.length) {
			front=1;
			return;
		}
		front++;
		
	}
	
	public void display() {
			
		int temp=front;
		
		System.out.print("\nQueue-> front [ ");
		while(true) {
			System.out.print(arr[temp] + " ");
			temp++;
			
			if(temp==rear) {
				System.out.print("] rear\n");
				break;
			}
			
			if(temp==arr.length)
				temp=0;
		}
		
	}

}
