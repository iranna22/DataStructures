package com.iranna.array;

import java.util.Arrays;

public class ArraySortedCheck {
	public static void main(String[] args) {
		// Define an array to check
		int[] array = { 1, 2, 2, 4,6, 5 };

		// 1. Using Built-in Methods
		System.out.println("Using Built-in Methods:");
		checkSortedUsingBuiltInMethods(array);

		// 2. Without Using Built-in Methods
		System.out.println("\nWithout Using Built-in Methods:");
		checkSortedWithoutBuiltInMethods(array);
	}

	// Method to check if array is sorted using built-in methods
	public static void checkSortedUsingBuiltInMethods(int[] array) {
		// Step 1: Make a copy of the array
		int[] sortedArray = array.clone();

		// Step 2: Sort the copied array
		Arrays.sort(sortedArray);

		// Step 3: Check if the original array matches the sorted array
		boolean isSorted = Arrays.equals(array, sortedArray);

		// Step 4: Print the result
		if (isSorted) {
			System.out.println("The array is sorted in ascending order.");
		} else {
			System.out.println("The array is not sorted in ascending order.");
		}
	}

	// Method to check if array is sorted without using built-in methods
	public static void checkSortedWithoutBuiltInMethods(int[] array) {
		// Step 1: Assume the array is sorted
		boolean isSorted = true;

		// Step 2: Loop through the array to check the order
		for (int i = 0; i < array.length - 1; i++) {
			// Step 3: Compare each element with the next element
			if (array[i] > array[i + 1]) {
				isSorted = false; // Mark as not sorted if the order is violated
				break; // Exit the loop early since it's not sorted
			}
		}

		// Step 4: Print the result
		if (isSorted) {
			System.out.println("The array is sorted in ascending order.");
		} else {
			System.out.println("The array is not sorted in ascending order.");
		}
	}
}
