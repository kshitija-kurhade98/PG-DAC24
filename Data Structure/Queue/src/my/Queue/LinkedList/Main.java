package my.Queue.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(1000);
		queue.enqueue(5000);
	
		queue.display();
		
		queue.deque();
		queue.deque();
		queue.deque();
		
		queue.display();
		
		queue.enqueue(2000);
		queue.enqueue(7000);
		queue.enqueue(9000);
		queue.display();
		
		queue.deque();
		queue.display();
		
		queue.enqueue(10000);
		queue.display();
	}

}
