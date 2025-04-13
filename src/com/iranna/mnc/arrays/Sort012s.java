package com.iranna.mnc.arrays;

import java.util.Arrays;
//This is solved with Dutch National Flag Algorithm
//single scan (O(N) time complexity)
public class Sort012s {
	 public static void sort012(int[] arr) {
	        // code here
	        int low = 0, mid = 0, high = arr.length - 1;

	        while (mid <= high) {
	            if (arr[mid] == 0) {
	                // Swap arr[mid] and arr[low], move both pointers
	                swap(arr, mid, low);
	                low++;
	                mid++;
	            } else if (arr[mid] == 1) {
	                // Just move mid pointer
	                mid++;
	            } else {
	                // Swap arr[mid] and arr[high], move high pointer
	                swap(arr, mid, high);
	                high--;
	            }
	        }
	    }
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {2, 0, 2, 1, 1, 0};
	        sort012(arr);
	        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 1, 1, 2, 2]
	    }
}
