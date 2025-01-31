package com.iranna.algorithms;

import java.util.Arrays;

public class QuickSort {

    // Function to partition the array on the basis of pivot element
    static int partition(int array[], int low, int high) {
        // pivot
        int pivot = array[high]; 

        // Index of smaller element and indicates 
        // the right position of pivot found so far
        int i = (low - 1); 

        for (int j = low; j < high; j++) {

            // If current element is smaller or 
            // equal to pivot
            if (array[j] <= pivot) {

                // increment index of smaller element
                i++;

                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort 
      arr[] --> Array to be sorted, 
      low --> Starting index, 
      high --> Ending index */
    static void sort(int array[], int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p] is now
            // at right place
            int pi = partition(array, low, high);

            // Recursively sort elements before 
            // partition
            sort(array, low, pi - 1);

            // Recursively sort elements after partition
            sort(array, pi + 1, high);
        }
    }

    // Driver Code
    public static void main(String args[]) {
        int[] data = {8, 7, 2, 1, 0, 9, 6};

        System.out.println("Unsorted Array: " + Arrays.toString(data)); 

        sort(data, 0, data.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(data)); 
    }
}