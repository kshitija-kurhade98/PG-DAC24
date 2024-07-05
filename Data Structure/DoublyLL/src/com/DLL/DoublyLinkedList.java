package com.DLL;

public class DoublyLinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//at last
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null ) {
			return false;
		}
		
		if( head == null ) {
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		while( temp.getNext() != null ) {
			temp = temp.getNext();
		}
		
		newNode.setPrev(temp);
		temp.setNext(newNode);
		return true;
	}
	
	
	//insert at pos
	@SuppressWarnings("unused")
	public boolean insert(int data, int pos) {
		
		Node newNode = new Node(data);
		
		if(newNode == null ) {
			return false;
		}
		
		if( pos == 1 ) {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
			return true;
		}
		
		Node temp = head;
		
		if(pos > 1 ) {
			for(int i=1; i<pos-1; i++) {
				temp = temp.getNext();
			}
			newNode.setPrev(temp);
			newNode.setNext(temp.getNext());
			temp.getNext().setPrev(newNode);
			temp.setNext(newNode);
		}
		
		
		return true;
	}
	
	//delete by val
	public boolean delete(int data) {
		Node temp = head;
		
		while(temp.getData() != data ) {
			temp = temp.getNext();
		}
		System.out.println("\nDeleted Elem : "+temp.getData());
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		return true;
	}
	
	//delete by pos
	public boolean deleteByPos(int pos) {
		
		if( pos == 1 ) {
			head = head.getNext();
			return true;
		}
		
		Node temp = head;
		
		for(int i=1; i<pos; i++) {
			temp = temp.getNext();
		}
		
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		return true;
		
	}
	
	public void display() {
		Node temp = head;
		
		System.out.println("\n-----------------DLL-----------------");
		while(temp != null ) {
			System.out.print(temp.getData()+" -> ");
			temp =  temp.getNext();
		}
		System.out.println("null\n");
	}
	
	//reverse
	public void reverse() {
		Node temp = head;
		System.out.println("\n---------------Revsrse----------------");
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		 while(temp != null ) {
			 System.out.print(temp.getData()+" -> ");
			 temp = temp.getPrev();
		 }
		 System.out.println("null\n");
	}

	//count
	public void count() {
		Node temp = head;
		int cnt=0;
		while(temp != null ) {
			cnt++;
			temp = temp.getNext();
		}
		System.out.println("\nCount : "+cnt);
	}
	
	//min
	public void getMin() {
		Node temp = head;
		int min = head.getData();
		
		while(temp != null ) {
			if(min > temp.getData()) {
				min = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("\nMin : "+min);
	}
	
	//Max
	public void getMax() {
			Node temp = head;
			int max = head.getData();
			
			while(temp != null ) {
				if(max < temp.getData()) {
					max = temp.getData();
				}
				temp = temp.getNext();
			}
			System.out.println("Max : "+max);
	}
	
	//remove duplicates
	public void removeDuplicates() {
		
		Node ptr1 = null, ptr2=null ;
		ptr1 = head;
		
		System.out.println("\nList After Duplicate Removal : ");
		while(ptr1 != null && ptr1.getNext() != null ) {
			ptr2 = ptr1;
			
			while(ptr2.getNext() != null ) {
				
				if(ptr1.getData() == ptr2.getNext().getData()) {
					ptr2.setNext(ptr2.getNext().getNext());
//					ptr2.getNext().getNext().setPrev(ptr2);
				}
				else {
					ptr2= ptr2.getNext();
				}
			}
			ptr1 = ptr1.getNext();
		}
		
	}
	
	//search
	public void search(int data) {
		
		Node temp = head;
		int cnt=0;
		while(temp.getData() != data) {
			cnt++;
			temp = temp.getNext();
		}
//		if(temp.getData()== data) {
//		
//			System.out.println("Element "+temp.getData()+" found at "+cnt);
//		}else {
//			System.out.println("Element not Found!!");
//		}
		
		System.out.println("Element "+temp.getData()+" found at "+cnt);
		
		
	}
	
	public void search2(int data) {
		Node temp = head;
		
		while(temp.getData() != data ) {
			temp = temp.getNext();
		}
		System.out.println("\nSearch Elem : "+temp.getData());
	}
}
