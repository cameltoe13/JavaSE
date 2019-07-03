package com.anatol.everything;

public class BinarySearch {

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start < end) {
            int mid = start + (end - start) / 2;

            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid -1, key);
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);

            } else if(key == sortedArray[mid]){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr1 = {0, -5, 2, 45, 234, 567, 876, 900, 976, 999, 1};

        int index = recursiveBinarySearch(arr1,0,arr1.length,0);
        System.out.println("Found 0 at "+index+" index");

        index = recursiveBinarySearch(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");

        index = recursiveBinarySearch(arr1, 0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");

        index = recursiveBinarySearch(arr1,0,arr1.length,567);
        System.out.println("Found 876 at "+index+" index");
    }
}
