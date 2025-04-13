package com.iranna.mnc.arrays;


import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,1,2,3};

        // Using built-in methods (HashSet)
        findDuplicatesUsingHashSet(arr);

        // Without using built-in methods
        findDuplicatesWithoutHashSet(arr);
    }

    // Using HashSet (built-in method)
    public static void findDuplicatesUsingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates using HashSet: " + duplicates);
    }

    // Without using built-in methods
    public static void findDuplicatesWithoutHashSet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                    break; // Break inner loop after finding one duplicate
                }
            }
        }
    }
}