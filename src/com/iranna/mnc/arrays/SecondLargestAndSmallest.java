package com.iranna.mnc.arrays;

import java.util.Arrays;

public class SecondLargestAndSmallest {
	public static int[] findSecondLargestAndSmallest(int[] a) {
        Arrays.sort(a); // Sorting the array
        return new int[]{a[a.length - 2], a[1]}; // Second largest, Second smallest
    }	
	public static int[] findSecondLargestAndSmallestWithoutSort(int[] a) {
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : a) {
            // Finding first and second largest
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }

            // Finding first and second smallest
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }
        return new int[]{secondLargest, secondSmallest};
}
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,65,13};
        int[] result = findSecondLargestAndSmallest(a);
        System.out.println(Arrays.toString(result)); // Output: [4, 2]
        int [] result2= findSecondLargestAndSmallestWithoutSort(a);
        System.out.println(Arrays.toString(result2));
    }
}
