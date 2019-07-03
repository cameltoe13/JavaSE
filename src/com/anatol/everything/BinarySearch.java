package com.anatol.everything;


public class BinarySearch {

	public static int binarySearch(int[] arr, int start, int end, int key) {
	
		if(start < end) {
			int middle = (start + end) / 2;
			
			if(key < arr[middle]){
				return binarySearch(arr, start, middle - 1, key);
			}
			

			else if(key > arr[middle]) {
				return binarySearch(arr, middle + 1, end, key);
			}
			
			else {
				return middle; 
			}
		}
		return -1;
	}

	public static void main(String args[]) {

		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(array, 0, array.length, 9);
		System.out.println("Found 9 at " + index  + " index.");

		index = binarySearch(array, 0, array.length, 5);
		System.out.println("Found 5 at " + index  + " index.");

		index = binarySearch(array, 0, array.length, 1);
		System.out.println("Found 1 at " + index  + " index.");
	}


}
