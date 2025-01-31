package com.iranna.array;


import java.util.Arrays;

public class FindMinMax {

    public static void main(String[] args) {
        int[] arr = {12, 3, 45, 7, 23,99, 19, 5};

        // Using built-in methods
        int minUsingBuiltIn = findMinUsingBuiltIn(arr);
        int maxUsingBuiltIn = findMaxUsingBuiltIn(arr);

        System.out.println("Using built-in methods:");
        System.out.println("Smallest element: " + minUsingBuiltIn);
        System.out.println("Largest element: " + maxUsingBuiltIn);

        // Without using built-in methods
        int minWithoutBuiltIn = findMinWithoutBuiltIn(arr);
        int maxWithoutBuiltIn = findMaxWithoutBuiltIn(arr);

        System.out.println("\nWithout using built-in methods:");
        System.out.println("Smallest element: " + minWithoutBuiltIn);
        System.out.println("Largest element: " + maxWithoutBuiltIn);
    }

    // Using built-in methods
    public static int findMinUsingBuiltIn(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int findMaxUsingBuiltIn(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    // Without using built-in methods
    public static int findMinWithoutBuiltIn(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxWithoutBuiltIn(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}