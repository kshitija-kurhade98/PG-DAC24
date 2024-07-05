package com.app;

public class LinkedList {
	
	private Node head;

	
	public LinkedList() {
		this.head = null;
	}


	public Node getHead() {
		return head;
	}

	//insert at Last
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		if(head.getData() == data) {
			return false;
		}
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
			if(temp.getData() == data) {
				return false;
			}
		}
		
		temp.setNext(newNode);
		return true;
		
	}
	
	public void display() {
		
		Node temp = head;
		System.out.println("------------------ Linked List --------------------");
		while(temp != null) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
		System.out.println("----------------------------------------------------");
	}
	
	public void getMax() {
		int max = head.getData();
		Node temp = head;
		
		while(temp.getNext() != null) {
			if(max < temp.getNext().getData()) {
				max = temp.getNext().getData();
				temp = temp.getNext();
			}
			else {
				temp = temp.getNext();
			}
		}
		System.out.println("\n Max Node : "+max+" -> null");
	}
	
	public void getMin() {
		int min = head.getData();
		Node temp = head;
		
		while(temp.getNext() != null) {
			if(min > temp.getNext().getData()) {
				min = temp.getNext().getData();
				temp = temp.getNext();
			}
			else {
				temp = temp.getNext();
			}
		}
		System.out.println("\n Min Node : "+min+" -> null");
	}
	
	public void sum() {
		int sum = head.getData();
		Node temp = head;
		
		while(temp.getNext() != null) {
			sum += temp.getNext().getData();
			temp = temp.getNext();
		}
		
		System.out.println("\n Sum : "+sum);
	}
	
	

}
