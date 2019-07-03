package com.anatol.everything;

import java.util.Arrays;

public class BubbleSort {

     static void bubbleSort(int[] arr, int n) {
        if ( n == 1)
            return;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1]) {
                // for descending order
                // if (arr[i] < arr[i+1]

                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {54, 7, 60, 3, 4, 18 ,21, 2};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));



    }
}
