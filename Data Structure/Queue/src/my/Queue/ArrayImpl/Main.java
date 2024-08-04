package my.Queue.ArrayImpl;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		
		Queue queue = new Queue(size);
		
		queue.enqueue(20);
		queue.enqueue(52);
		queue.enqueue(100);
		queue.enqueue(5);
		
		queue.display();
		
		queue.deque();
		queue.deque();
		queue.display(); 
		
		queue.enqueue(30);
		queue.enqueue(5000);
		queue.display();
	}

}
