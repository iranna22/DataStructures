package com.iranna.leetcode.arrays;


public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums1)); // Output: 2

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums2)); // Output: 2

        // Test case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums3)); // Output: 8
    }
}
