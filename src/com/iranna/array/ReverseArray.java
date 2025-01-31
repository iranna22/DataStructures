package com.iranna.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    // Method 1: Reverse array using built-in methods
    public static Integer[] reverseUsingBuiltIn(Integer[] array) {
        // Convert the array to a List
        List<Integer> list = Arrays.asList(array);

        // Use Collections.reverse() to reverse the List
        Collections.reverse(list);

        // Convert the List back to an array (optional)
        return list.toArray(new Integer[0]);
    }

    // Method 2: Reverse array without using built-in methods
    public static int[] reverseWithoutBuiltIn(int[] array) {
        int start = 0;               // Pointer to the first element
        int end = array.length - 1;  // Pointer to the last element

        // Reverse the array manually by swapping
        while (start < end) {
            // Swap the elements at the 'start' and 'end' positions
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }

        // Return the reversed array
        return array;
    }

    public static void main(String[] args) {
        // Example for built-in method
        Integer[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Original array (Integer): " + Arrays.toString(array1));
        Integer[] reversedArray1 = reverseUsingBuiltIn(array1);
        System.out.println("Reversed array using built-in methods: " + Arrays.toString(reversedArray1));

        // Example for manual method
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println("\nOriginal array (int): " + Arrays.toString(array2));
        int[] reversedArray2 = reverseWithoutBuiltIn(array2);
        System.out.print("Reversed array without built-in methods: ");
        for (int num : reversedArray2) {
            System.out.print(num + " ");
        }
    }
}
