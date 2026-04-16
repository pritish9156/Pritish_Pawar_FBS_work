package queue.circularqueue;

//using formula
public class CircularQueueOptimized {

	int[] arr;
	int front, rear;
	
	CircularQueueOptimized(int size){
		arr = new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		if(rear==arr.length-1 && front==0 || rear+1==front)
			return true;
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if(rear==-1 && front==-1)
			return true;
		else 
			return false;
	}
	
	public boolean enqueue(int ele) {
		
		if(isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		
		if(isEmpty()) {
			front=0;
		}

		rear=(rear+1)%arr.length;
		arr[rear]=ele;
		return true;

	}
	
	public boolean dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return false;
		}
		
		if(rear==front) {
			front=-1;
			rear=-1;
			
			return true;
		}
		
		front=(front+1)%arr.length;
		
		return true;
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
				
			if(i==rear) 
				break;
			else 
				i=(i+1)%arr.length;
		}
	}
	
}
