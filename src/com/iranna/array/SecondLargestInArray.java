package com.iranna.array;


import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1}; // Example array

        // Call the method that uses library methods
        System.out.println("Using Library Method:");
        findSecondLargestUsingLibrary(numbers);

        // Call the method that does not use library methods
        System.out.println("Without Using Library Method:");
        findSecondLargestWithoutLibrary(numbers);
    }

    // Method to find the second largest number using library methods
    public static void findSecondLargestUsingLibrary(int[] numbers) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(numbers);

        // Step 2: Find the largest element
        int largest = numbers[numbers.length - 1]; // The last element in the sorted array
        // 3,2,10,1,4,8->1,2,3,4,8,10
        // Step 3: Iterate backward to find the second largest element
        int secondLargest = -1; // Initialize second largest
        for (int i = numbers.length - 2; i >= 0; i--) { // Start from the second last element
            if (numbers[i] < largest) { // Check for the first smaller number.This prevents assigning duplicates
            	//of the largest number as the second largest.
                secondLargest = numbers[i];
                break; // Exit loop after finding second largest
            }
        }

        // Print the second largest number
        if (secondLargest == -1) {
            System.out.println("No second largest number found!");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }

    // Method to find the second largest number without using library methods
    public static void findSecondLargestWithoutLibrary(int[] numbers) {
        // Step 1: Initialize variables for largest and second largest
        int largest = Integer.MIN_VALUE; // Smallest possible integer value
        int secondLargest = Integer.MIN_VALUE;
         // 3,2,10,1,4,8
        // Step 2: Traverse the array to find the largest and second largest numbers
        for (int num : numbers) {
            if (num > largest) { // If current number is greater than largest
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num < largest) { 
                // If current number is greater than second largest but smaller than largest
                secondLargest = num;
            }
        }

        // Step 3: Check if a valid second largest number exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found!");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }
}
