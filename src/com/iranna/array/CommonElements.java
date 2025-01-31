package com.iranna.array;


import java.util.*;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,4,5};
        int[] arr2 = {4, 5, 6, 7, 8,5,4};

        // Using built-in methods (HashSet)
        Set<Integer> commonElements1 = findCommonElementsUsingHashSet(arr1, arr2);
        System.out.println("Common elements (using HashSet): " + commonElements1);

        // Not using built-in methods (brute force)
        Set<Integer> commonElements2 = findCommonElementsBruteForce(arr1, arr2);
        System.out.println("Common elements (brute force): " + commonElements2);
    }

    // Using HashSet
    public static Set<Integer> findCommonElementsUsingHashSet(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

       // List<Integer> commonElements = new ArrayList<>();
        Set<Integer> commonElements = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

    // Not using built-in methods (brute force)
    public static Set<Integer> findCommonElementsBruteForce(int[] arr1, int[] arr2) {
       // List<Integer> commonElements = new ArrayList<>();
        Set<Integer> commonElements = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                    break; // Avoid duplicates
                }
            }
        }

        return commonElements;
    }
}