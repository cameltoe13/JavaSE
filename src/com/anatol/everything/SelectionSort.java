package com.anatol.everything;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {41, 56, 1, 4, 63, 7};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] array){

        int lengthArray = array.length;

        for (int i = 0; i < lengthArray - 1; i++) {

            int minimElement = i;

            for (int j = i+1; j < lengthArray; j++){
                if (array[j] < array[minimElement]) {
                    minimElement = j;
                }
            }

            //swap the smallest value with the position i

            int temp = array[i];
            array[i] = array[minimElement];
            array[minimElement] = temp;
        }

    }
}
