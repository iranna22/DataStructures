package com.iranna.algorithms;


public class MergeSort {
    
    // Main method to test the Merge Sort algorithm
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10}; // Sample array to sort
        System.out.println("Original Array:");
        printArray(array);
        
        // Sort the array using merge sort
        mergeSort(array, 0, array.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Recursive method to divide and sort the array
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) { // Base condition: If the array has more than one element
            // Step 1: Find the middle index of the array
            int mid = left + (right - left) / 2;

            // Step 2: Recursively sort the left half of the array
            mergeSort(array, left, mid);

            // Step 3: Recursively sort the right half of the array
            mergeSort(array, mid + 1, right);

            // Step 4: Merge the two sorted halves
            merge(array, left, mid, right);
        }
    }

    // Method to merge two sorted halves of the array
    public static void merge(int[] array, int left, int mid, int right) {
        // Step 1: Calculate sizes of the two subarrays
        int n1 = mid - left + 1; // Size of the left subarray
        int n2 = right - mid;    // Size of the right subarray

        // Step 2: Create temporary arrays to hold the data
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Step 3: Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Step 4: Merge the temporary arrays back into the original array
        int i = 0, j = 0; // Initial indices for leftArray and rightArray
        int k = left;     // Initial index for the merged array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Step 5: Copy any remaining elements from leftArray (if any)
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Step 6: Copy any remaining elements from rightArray (if any)
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
