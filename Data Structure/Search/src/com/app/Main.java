package com.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("Enter Size : ");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter Element ["+i+"]");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter Element to Search : ");
		int key = sc.nextInt();
		
		LinearSearch ls = new LinearSearch();
		ls.search(arr, key);
		
		BinarySearch bs = new BinarySearch();
		
//		arr = bs.sort(arr);
//		
//		System.out.println("-------  Sorted Data -------------");
//		for(int i=0; i<size; i++) {
//			System.out.println(arr[i]+" ");
//		}
		
		bs.search(arr, key);
		
		
		
//		boolean exit = false;
//		
//		while(!exit) {
//			
//		System.out.println("\n\n__________MENU_________"
//				+ "\n 1. Linear Search "
//				+ "\n 2. Binary Search"
//				+ "\n 0. Exit");
//		
//		System.out.println("\n Enter Choice : ");
//		
//		switch (sc.nextInt()) {
//		
//		case 1:
//			ls.search(arr, key);
//			break;
//			
//		case 2:
//			break;
//			
//		case 0 :
//			exit = true;
//			break;
//
//		default:
//			System.out.println("Invalid Choice.");
//			break;
//		}
//		
//		}
//		
		
	}
}
