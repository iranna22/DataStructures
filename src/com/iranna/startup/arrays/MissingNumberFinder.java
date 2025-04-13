package com.iranna.startup.arrays;

/*Missing in Array from GFG*/
public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum; // Missing number
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 2, 4, 5, 3, 7, 1}; // Example case
        System.out.println("Missing Number: " + findMissingNumber(arr1)); // Output: 4

        int[] arr2 = {1}; // Edge case: Single element
        System.out.println("Missing Number: " + findMissingNumber(arr2)); // Output: 2
    }
}
