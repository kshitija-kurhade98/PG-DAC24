package com.app;

//import java.util.LinkedList;

public class LinkedList1 {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
//	insert at first 
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
		
		newNode.setNext(head);   //
		head = newNode;			// insert at pos 1
		
		return true;
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
	
//	public void findMid(LinkedList1 lst) {
//		LinkedList<LinkedList1> list = new LinkedList<>(lst);
//		
//	}
	
	//using one pass
	public void findMid() {
		
		Node temp= head;
		Node mid = head;
		
		while(temp != null && temp.getNext() != null ) {
			
			temp = temp.getNext().getNext();
			mid = mid.getNext();
			
		}
		System.out.println("\n Mid Node (using one pass) : "+mid.getData()+" -> null");
	}
	
	//using two pass
	public void findMiddle() {
		
		Node temp = head;
		int cnt=0;
		
		while(temp.getNext() != null) {
			cnt++;
			temp = temp.getNext();
		}
		
		int mid = cnt/2;
		cnt = 1;
		temp = head;
		while(cnt <= mid) {
			cnt++;
			temp = temp.getNext();
		}
		
		System.out.println(" Mid Node (using two pass) : "+temp.getData()+" -> null");
		
	}
}
