package com.iranna.array;

import java.util.Arrays;

public class ArrayRotation {

	// Function to rotate the array to the right
	public static void rotateRight(int[] arr, int k) {
		int n = arr.length;
		if (n == 0)
			return;

		// Normalize the number of rotations
		k = k % n;
		if (k == 0)
			return;

		// Step 1: Reverse the whole array
		reverse(arr, 0, n - 1);

		// Step 2: Reverse the first k elements
		reverse(arr, 0, k - 1);

		// Step 3: Reverse the remaining elements
		reverse(arr, k, n - 1);
	}

	// Helper function to reverse a portion of the array
	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int k = 2; // Number of rotations

		System.out.println("Original Array: " + Arrays.toString(array));
		rotateRight(array, k);
		System.out.println("Array after " + k + " rotations: " + Arrays.toString(array));
	}
}
