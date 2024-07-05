package com.product;

import com.product.Node;

public class LinkedList {
	
	private Node head;

	public LinkedList() {
		super();
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	@SuppressWarnings("unused")
	public boolean insert(Product data) {
		
		Node newNode = new Node(data);
		
		if(newNode ==  null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
		}
		
		if(head.getData() == data) {
			return false;
		}
		
		Node temp = head;
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
			System.out.println(temp.getData()+" -> ");
			temp = temp.getNext();
		}
		System.out.println("null");
		System.out.println("----------------------------------------------------");
	}
	

}
