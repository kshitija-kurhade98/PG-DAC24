package com.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		
		stack.push(20);
		stack.push(50);
		stack.push(120);
		stack.push(70);
		
		
		stack.display();		
	
		stack.pop();
		stack.pop();
		
		stack.display();
		
		stack.push(80);
		stack.push(100);
		stack.push(200);
		stack.push(70);
		stack.display();
		stack.pop();
		stack.display();

	}

}
