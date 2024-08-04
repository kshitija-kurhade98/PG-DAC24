package my.Queue.ArrayImpl;

public class Queue {
	
	private int[] arr;
	private int size, front, rear;
	
	
	public Queue(int size) {
		super();
		this.size = size;
		front = rear = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return (front == -1 && rear == -1) || (front > rear);
	}
	
	public boolean isFull() {
		return rear == (size-1);
	}
	
	public boolean enqueue(int data) {
		
		if(isFull()) {
			System.out.println("\nCant Insert..... Queue Full!");
			return false;
		}
		
		arr[++rear] = data;
		
		if(front == -1) {
			front = 0;
		}
		return true;
		
	}
	
	public boolean deque() {
		
		if(isEmpty()) {
			System.out.println("\nCant Delete ...... Queue is Empty!");
			return false;
		}
		
		System.out.println("Dequed Elem : "+arr[front]);
		arr[front]=0;
		front++;
		return true;
	}
	
	public void display() {
		System.out.println("\n------------ Queue Elements ------------");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
}
