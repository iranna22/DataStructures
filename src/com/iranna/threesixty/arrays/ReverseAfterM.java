package com.iranna.threesixty.arrays;


import java.util.*;

public class ReverseAfterM {
    public static void main(String[] args) {
        // Example input
        ArrayList<Integer> ARR = new ArrayList<>(Arrays.asList(27, 14, 25, 10, 19, 23, 29, 15, 15, 19));
        
        // The given array
        int M = 2; // Position after which the array needs to be reversed
        // Test cases 4
   /*     n=1 m=0
        arr[]={5} 
       n= 5 m=2
       arr[]={ 3 3 3 3 3} 
       n= 2 m= 0
        arr[]={3, 4}
        n=10 m=2
       arr[] = {27 14 25 10 19 23 29 15 15 19} 
*/

        // Call the function to reverse the array after position M
        reverseAfterM(ARR, M);

        // Print the updated array
        System.out.println("Reversed Array: " + ARR);
    }

    // Function to reverse the array after position M
    public static void reverseAfterM(ArrayList<Integer> arr, int m) {
    	// Check if M is a valid position in the ArrayList
        // if (m < 0 || m >= arr.size() - 1) {
        //     System.out.println("Invalid position M. No changes made.");
        //     return;
        // }

        // Initialize two pointers: one at the start of the sublist and one at the end
        int start = m + 1; // The first index of the sublist to reverse
        int end = arr.size() - 1; // The last index of the ArrayList

        // Swap elements until the pointers meet or cross
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            // Move the pointers closer to each other
            start++;
            end--;
        }
    }
}