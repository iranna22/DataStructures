package com.iranna.array;

import java.util.Arrays;

public class FindLargestNumbers {

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };

		// Using built-in methods
		System.out.println("Using built-in methods:");
		findLargestNumbersUsingBuiltIn(arr);

		// Without using built-in methods
		System.out.println("\nWithout using built-in methods:");
		findLargestNumbersWithoutBuiltIn(arr);
	}

	// Using built-in methods
	public static void findLargestNumbersUsingBuiltIn(int[] arr) {
		// 1. Sort the array in descending order
		Arrays.sort(arr);
		int n = arr.length;

		// 2. Print the first and second largest numbers
		System.out.println("First largest: " + arr[n - 1]);
		System.out.println("Second largest: " + arr[n - 2]);
	}

	// Without using built-in methods
	public static void findLargestNumbersWithoutBuiltIn(int[] arr) {
		int firstLargest = Integer.MIN_VALUE; // Initialize with minimum possible value
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			// 1. If current number is greater than firstLargest, update both
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}
			// 2. If current number is between firstLargest and secondLargest, update
			// secondLargest
			else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}

		System.out.println("First largest: " + firstLargest);
		System.out.println("Second largest: " + secondLargest);
	}
}