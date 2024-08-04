package com.app;

public class Main {

	public static void main(String[] args) {
		
		SLL sll = new SLL();
		
		sll.insert(100);
		sll.insert(200);
		sll.insert(300);
		sll.insert(400);
		sll.insert(500);
		
		System.out.println("____________LinkedList_____________");
//		sll.display();
		
		sll.calcLength();
	}
	

}
