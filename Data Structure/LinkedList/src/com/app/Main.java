package com.app;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(50);
		list.insert(100);
		
		list.display();
		
		list.getMax();
		
		list.getMin();
		
		list.sum();

	}

}
