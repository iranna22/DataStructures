package com.iranna.startup.arrays;


public class PeakElementFinder {
    /**
     * This method finds a peak element in the given array where no two adjacent elements are the same.
     * A peak element is defined as an element that is greater than its adjacent elements.
     *
     * @param arr The input array of integers.
     * @return The index of a peak element if found; otherwise, -1.
     */
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the mid element is greater than its left neighbor (or it's the first element)
            boolean leftCondition = (mid == 0) || (arr[mid] > arr[mid - 1]);
            
            // Check if the mid element is greater than its right neighbor (or it's the last element)
            boolean rightCondition = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            
            // If mid is the first element, leftCondition is always true since there is no left neighbor
            // If mid is the last element, rightCondition is always true since there is no right neighbor
            if (leftCondition && rightCondition) {
                return mid; // Found a peak element
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1; // Move to the left half
            } else {
                left = mid + 1; // Move to the right half
            }
        }
        return -1; // This case will not occur for a valid input
    }
    
    public static void main(String[] args) {
        int[] arr = {11,10,9,8,9,3,21,4};
        int peakIndex = findPeakElement(arr);
        
        // Verify if the index is a valid peak
        boolean isValid = (peakIndex >= 0 && peakIndex < arr.length) && // Ensure peakIndex is within bounds
                          (peakIndex == 0 || arr[peakIndex] > arr[peakIndex - 1]) && // Check if it's greater than left neighbor (or first element)
                          (peakIndex == arr.length - 1 || arr[peakIndex] > arr[peakIndex + 1]); // Check if it's greater than right neighbor (or last element)
        
        // Print the results
        System.out.println("Peak Index: " + peakIndex);
        System.out.println(isValid ? "true" : "false");
    }
}
