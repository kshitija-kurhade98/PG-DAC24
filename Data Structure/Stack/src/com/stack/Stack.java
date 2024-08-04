package com.stack;

//LIFO
//insert at last
//delete at first

public class Stack {

	private Node top;

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}
	
	public boolean isEmpty() {
		if(top == null)
			return true;
		else {
		    return false;
		}
	}
	
	//insert at last
	@SuppressWarnings("unused")
	public boolean push(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null ) {
			return false;
		}
		
		if(isEmpty()) {
			top = newNode;
			return true;
		}
		
		Node temp = top;
	
		while(temp.getnext() != null) {
			temp = temp.getnext();
		}
		
		temp.setnext(newNode);
		return true;
		
	}
//	
//	//delete at first
//	public boolean pop() {
//		
//		if(isEmpty()) {
//			System.out.println("cant pop ... stack is Empty!");
//			return false;
//		}
//		
//		System.out.println("Popped Data : "+top.getData()+" -> Null");
//		top = top.getnext();
//		
//		return true;
//	}
	
	//delete at last
	public boolean pop() {
		
		if(isEmpty()) {
			System.out.println("cant pop ... stack is Empty!");
			return false;
		}
		
		Node temp = top;
		
		while(temp.getnext().getnext() != null) {
			temp = temp.getnext();
		}
		
		temp.setnext(null);
		return true;
	}
	
	public void display() {
		System.out.println("----------------- Stack -------------------");
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.getnext();
		}
		System.out.println("Null");
		
		System.out.println("---------------------------------------------\n");
		
	}
}
