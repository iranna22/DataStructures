package com.iranna.threesixty.arrays;

import java.util.*;

public class PairSum {
	public static List<List<Integer>> findPairsWithSumHashMap(int[] arr, int S) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = S - num;

            // Check if the complement exists in the map
            if (map.getOrDefault(complement, 0) > 0) {
                result.add(Arrays.asList(Math.min(num, complement), Math.max(num, complement)));
                map.put(complement, map.get(complement) - 1); // Decrease count of complement
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1); // Add number to the map
            }
        }

        // Sort the pairs as per the requirements
        result.sort((a, b) -> a.get(0).equals(b.get(0)) ? a.get(1) - b.get(1) : a.get(0) - b.get(0));
        return result;
    }
	
	public static List<List<Integer>> findPairsWithSumTwoPointers(int[] arr, int S) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == S) {
                result.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;
            } else if (sum < S) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Input
        int n = 6;
        int s = 8;
        int[] arr = {1,2,3,4,5,6};

        // Find pairs
        List<List<Integer>> pairs1 = findPairsWithSumHashMap(arr, s);
        List<List<Integer>> pairs2 = findPairsWithSumTwoPointers(arr, s);

        // Output the result
        System.out.println("pairs with hasmap :");
        for (List<Integer> pair : pairs1) {
        	System.out.println(pair.get(0) + " " + pair.get(1));  
        }
        System.out.println("pairs with two pointers :");
        for (List<Integer> pair : pairs2) {
        	System.out.println(pair.get(0) + " " + pair.get(1));  
        }
    }
}