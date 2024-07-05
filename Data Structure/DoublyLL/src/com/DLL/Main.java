package com.DLL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insert(100);
		dll.insert(10);
		dll.insert(2);
		
		dll.display();
		
		dll.insert(5000, 2);
		dll.display();

		dll.insert(11, 1);
		dll.display();
//		
//		dll.delete(10);
//		dll.display();
		
		dll.insert(5055);
		dll.insert(444,3);
		
		dll.display();
		
		dll.deleteByPos(2);
		dll.display();
		dll.insert(10,6);
		dll.display();
		
		dll.removeDuplicates();
		dll.display();
		
		dll.reverse();
		
		dll.count();
		dll.getMin();
		dll.getMax();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Elem to search :");
		int key = sc.nextInt();
		dll.search(key);
	}

}
