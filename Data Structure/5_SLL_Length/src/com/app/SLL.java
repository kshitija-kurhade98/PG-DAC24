package com.app;

public class SLL {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
//	insert at last
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
		
		while(temp.getNext() != null ) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
		
		return true;
		
	}
	
	public int display() {
		Node temp = head;
		int cnt = 0;
		while(temp != null ) {
			System.out.print(temp.getData()+" -> ");
			cnt++;
			temp = temp.getNext();
		}
		System.out.println("null");
		return cnt;
	}
	
	public void calcLength() {
		
		int length = display();
		System.out.println("\n\n Length pf SLL : "+length);
		
	}
	
	
}
