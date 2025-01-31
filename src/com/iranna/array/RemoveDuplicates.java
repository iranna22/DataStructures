package com.iranna.array;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,10,11,10};

        // Using built-in methods (HashSet)
        System.out.println("Using HashSet:");
        System.out.println(Arrays.toString(removeDuplicatesUsingHashSet(arr)));

        // Not using built-in methods
        System.out.println("Without using built-in methods:");
        System.out.println(Arrays.toString(removeDuplicatesWithoutHashSet(arr)));
    }

    // Using HashSet
    public static int[] removeDuplicatesUsingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i] = num;
            i++;
        }
        return result;
    }

 // Without using built-in methods
    public static int[] removeDuplicatesWithoutHashSet(int[] arr) {
        if (arr.length == 0) {
            return new int[0]; // Handle empty array
        }

        int[] result = new int[arr.length]; // Initialize result array with the same size
        result[0] = arr[0]; // First element is always unique
        int index = 1; // Index for the result array

        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;

            // [1,2,3,4,5] [1,]  
            // Check if the current element exists in the result array
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break; // No need to continue checking if a duplicate is found
                }
            }

            // If not a duplicate, add it to the result array
            if (!isDuplicate) {
                result[index] = arr[i];
                index++;
            }
        }

        // Create a new array with the actual size of unique elements
        //We copy the result[] array to a new array uniqueArray[] because the result[] array might have extra space allocated that we don't want to return.
        int[] uniqueArray = new int[index];
        System.arraycopy(result, 0, uniqueArray, 0, index); 
        return uniqueArray;
    }
}