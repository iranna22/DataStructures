package com.iranna.strings;


public class StringReversal {

    public static void main(String[] args) {
        String original = "HelloWorld";

        // Reverse using built-in method
        System.out.println("Using Built-in Method:");
        String reversedUsingBuiltIn = reverseWithBuiltInMethod(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversedUsingBuiltIn);

        // Reverse without using built-in methods
        System.out.println("\nWithout Using Built-in Methods:");
        String reversedWithoutBuiltIn = reverseWithoutBuiltInMethod(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversedWithoutBuiltIn);
    }

    /**
     * Method to reverse a string using built-in methods.
     * 
     * @param str The input string.
     * @return The reversed string.
     */
    public static String reverseWithBuiltInMethod(String str) {
        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(str); // Create a StringBuilder instance with the input string
        sb.reverse(); // Use the built-in reverse() method
        return sb.toString(); // Convert the StringBuilder back to a String
    }

    /**
     * Method to reverse a string without using built-in methods.
     * 
     * @param str The input string.
     * @return The reversed string.
     */
    public static String reverseWithoutBuiltInMethod(String str) {
        char[] chars = str.toCharArray(); // Convert the string to a character array
        int left = 0; // Pointer to the start of the array
        int right = chars.length - 1; // Pointer to the end of the array

        // Swap characters at the start and end, moving towards the center
        while (left < right) {
            char temp = chars[left]; // Temporarily store the character at 'left'
            chars[left] = chars[right]; // Assign the character at 'right' to 'left'
            chars[right] = temp; // Assign the temporarily stored character to 'right'
            left++; // Move the 'left' pointer forward
            right--; // Move the 'right' pointer backward
        }

        return new String(chars); // Convert the modified character array back to a String
    }
}
