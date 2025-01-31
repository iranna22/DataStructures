package com.iranna.strings;

// remove all occurances of character
public class RemoveCharacter {

    // Method 1: Remove character using built-in methods
    public static String removeCharUsingBuiltin(String str, char ch) {
        // Replace all occurrences of the character with an empty string
        return str.replace(String.valueOf(ch), "");
        // String.replace() method replaces all occurrences of the specified character or string.
    }

    // Method 2: Remove character without using built-in methods
    public static String removeCharWithoutBuiltin(String str, char ch) {
        StringBuilder result = new StringBuilder(); // Create a StringBuilder to construct the result
        
        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not the one to be removed
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i)); // Append the character to the result
            }
        }
        
        // Convert StringBuilder back to a String and return
        return result.toString();
    }

    public static void main(String[] args) {
        // Input string and character to remove
        String input = "hello world";
        char toRemove = 'o';

        // Display result using built-in methods
        System.out.println("Using Built-in Methods:");
        System.out.println(removeCharUsingBuiltin(input, toRemove));

        // Display result without using built-in methods
        System.out.println("Without Using Built-in Methods:");
        System.out.println(removeCharWithoutBuiltin(input, toRemove));
    }
}
