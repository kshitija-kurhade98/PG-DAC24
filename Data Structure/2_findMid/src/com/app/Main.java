package com.app;

public class Main {

	public static void main(String[] args) {

		LinkedList1 list = new LinkedList1();
		
		list.insert(111);
		list.insert(222);
		list.insert(333);
		list.insert(444);
		list.insert(555);
		list.insert(666);
//		list.insert(777);
		
		System.out.println("................... LinkedList ...........................\n");
		list.display();
		System.out.println("___________________________________________________________");
		
		list.findMid();
		
		list.findMiddle();

	}

}
