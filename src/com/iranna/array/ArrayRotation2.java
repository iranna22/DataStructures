package com.iranna.array;

//Java Program to right rotate the array by d positions

//using temporary array

class ArrayRotation2 {

	// Function to rotate array by d positions using a temporary array
	static void rotateArr(int[] arr, int d) {
		int n = arr.length;

		// Handle case when d > n
		d %= n;

		// Storing rotated version of array
		int[] temp = new int[n];

		// Copy last d elements to the front of temp
		for (int i = 0; i < d; i++)
			temp[i] = arr[n - d + i];

		// Copy the first n - d elements to the back of temp
		for (int i = 0; i < n - d; i++)
			temp[i + d] = arr[i];

		// Copying the elements of temp in arr to get the
		// final rotated array
		for (int i = 0; i < n; i++)
			arr[i] = temp[i];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int d = 2;

		rotateArr(arr, d);

		// Print the rotated array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}