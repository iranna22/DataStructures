package com.iranna.strings;


public class PalindromeChecker {

    public static void main(String[] args) {
        String str = "racecar"; 

        // Check if the string is a palindrome using built-in methods
        boolean isPalindromeBuiltIn = isPalindromeBuiltIn(str);
        System.out.println("Is Palindrome (Built-in): " + isPalindromeBuiltIn);

        // Check if the string is a palindrome without using built-in methods
        boolean isPalindromeManual = isPalindromeManual(str);
        System.out.println("Is Palindrome (Manual): " + isPalindromeManual);
    }

    // Checks if a string is a palindrome using built-in methods (reverse() and equalsIgnoreCase())
    public static boolean isPalindromeBuiltIn(String str) {
        // 1. Reverse the string using the built-in reverse() method
        String reversedStr = new StringBuilder(str).reverse().toString(); 

        // 2. Compare the original string with the reversed string, ignoring case
        return str.equalsIgnoreCase(reversedStr); 
    }

    // Checks if a string is a palindrome without using built-in methods
    public static boolean isPalindromeManual(String str) {
        // 1. Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase(); 
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // 2. Initialize two pointers: 
        //    - 'left' pointing to the beginning of the string
        //    - 'right' pointing to the end of the string
        int left = 0;
        int right = str.length() - 1;

        // 3. Iterate until the pointers meet or cross each other
        while (left < right) {
            // 4. If the characters at the current 'left' and 'right' positions are not equal, 
            //    it's not a palindrome, so return false
            if (str.charAt(left) != str.charAt(right)) { 
                return false;
            }

            // 5. Move the 'left' pointer to the right
            left++; 

            // 6. Move the 'right' pointer to the left
            right--; 
        }

        // 7. If the loop completes without finding any mismatches, it's a palindrome
        return true;
    }
}