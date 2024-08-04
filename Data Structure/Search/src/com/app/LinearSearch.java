package com.app;

public class LinearSearch {
	
	public boolean search(int[] arr, int key) {
		System.out.println("\n\n Using Linear Search :");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key ) {
				System.out.println("\nElement "+arr[i]+" found at "+i+" index");
				return true;
			}
		}
		
		System.out.println("Element Not Found!");
		return false;		
	}


}
