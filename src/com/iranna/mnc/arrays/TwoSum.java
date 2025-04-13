package com.iranna.mnc.arrays;


import java.util.*;

public class TwoSum {
    public static List<int[]> findPairs(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); // Stores value -> index

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                result.add(new int[]{complement, num});
            }
            map.put(num, 1); // Store the number
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 4, 0, 5, -1};//{2, 7, 11, 15, 1, 8, 3};
        int target = 4;
     //   [[-1, 5], [0, 4], [1, 3], [2, 2]]

        List<int[]> pairs = findPairs(arr, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
