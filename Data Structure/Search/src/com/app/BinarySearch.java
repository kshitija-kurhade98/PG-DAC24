package com.app;

public class BinarySearch {

	public int[] sort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return arr;		
	}
	
	public boolean search(int[] arr, int key) {
		
		arr = sort(arr);
		System.out.println("\n-------  Sorted Data -------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		int low = 0;
		int high = arr.length-1;

		System.out.println("\n\n Using Binary Search :");
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid] == key) {
				System.out.println("\nElement "+arr[mid]+" found at "+mid+" index");
				return true;
			}
			else {
				if(key < arr[mid] ) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
		System.out.println("Element Not found..");
		return false;
		
	}
	
}
