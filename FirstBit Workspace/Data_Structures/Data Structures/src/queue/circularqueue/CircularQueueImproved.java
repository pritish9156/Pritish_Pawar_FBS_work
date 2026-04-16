package queue.circularqueue;

public class CircularQueueImproved {
	
	int[] arr;
	int front, rear;
	
	public CircularQueueImproved(int size){
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
		if(rear==arr.length-1 && front==0 || rear+1==front)
			return true;
		else
			return false;
	}
	
	public void enqueue(int ele) {
		
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		
		if(isEmpty()) {
			front=0;
		}
		
		if(rear==arr.length-1 && front!=0)
			rear=0;
		else
			rear++;
		
		arr[rear]=ele;
		
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		if(front==rear) {
			front = -1;
			rear = -1; 
			
			return;
		}
		
		if(front==arr.length-1 && rear != front) {
			front=0;
		}
		else {
			front++;
		}

		System.out.println();
		System.out.println(front);
		System.out.println(rear);
		System.out.println();
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		int i=front;
		
		System.out.print("[");
		
		while(true) {
			System.out.print(arr[i] + ", ");
			
			if(i==rear) {
				break;
			}else {
				i++;
				if(i==arr.length) {
					i=0;
				}
			}
		}
			
	}

}
