package com.iranna.leetcode.arrays;


import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of elements
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that would sum up to the target
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the complement and current number
                return new int[] {map.get(complement), i};
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (this won't happen as per the assumption)
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Example 1
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int target1 = 10;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
        
        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
       // System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        
        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
       // System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
