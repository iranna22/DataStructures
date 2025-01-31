package com.iranna.leetcode.arrays;


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Pointer to the position of the last unique element
        int uniqueIndex = 0;//1
        //{1,2,2,3}  - {1,
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the last unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // Return the count of unique elements
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4, 4, 5};
        int uniqueCount = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Modified array: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
