package my.Queue.LinkedList;

//FIFO
// insert , delete at first
public class Queue {
	
	private Node front, rear;

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}
	
	public boolean isEmpty() {
		if(rear == null && front==null) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unused")
	public boolean enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		
		if( rear == null ) {
			rear = newNode;
			front = newNode;
			return true;
		}
		
		newNode.setNext(rear);
		rear = newNode;
		front = newNode;
		
		return true;
	}
	
	public boolean deque() {
		if( isEmpty() ) {
			System.out.println("\nCant deque... Queue is Empty!");
			return false;
		}
		
		Node temp = front;
		System.out.println("\n\nDequeud Elem : "+front.getData()+" -> Null");
		front = temp.getNext();
		rear= temp.getNext();
		return true;
	}
	
	public void display() {
		Node temp = rear;
		System.out.println("\n---------------- Queue Elem --------------");
		while(temp != null) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.getNext();
		}
		System.out.print("Null\n");
	}
	
	

}
