package com.iranna.mnc.arrays;


import java.util.*;

public class PairSum {
	public static List<List<Integer>> findPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

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
    

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 0, 5, -1};
        int S = 4;
        System.out.println(findPairs(arr, S));
    }
}
