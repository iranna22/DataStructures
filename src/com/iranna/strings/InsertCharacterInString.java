package com.iranna.strings;


public class InsertCharacterInString {

    public static void main(String[] args) {
        // Input string, character to insert, and position
        String inputString = "HelloWorld";
        char charToInsert = ' ';
        int position = 5;

        // Using built-in methods
        System.out.println("Using built-in methods:");
        String resultBuiltIn = insertCharUsingBuiltIn(inputString, charToInsert, position);
        System.out.println("Result: " + resultBuiltIn);

        // Using custom method
        System.out.println("\nUsing custom method:");
        String resultCustom = insertCharUsingCustomMethod(inputString, charToInsert, position);
        System.out.println("Result: " + resultCustom);
    }

    /**
     * Method to insert a character into a string using built-in methods.
     * @param str The original string.
     * @param ch The character to insert.
     * @param pos The position at which to insert the character (0-based index).
     * @return The modified string with the character inserted.
     */
    public static String insertCharUsingBuiltIn(String str, char ch, int pos) {
        // Check if the position is valid
        if (pos < 0 || pos > str.length()) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Use substring method to split the string and concatenate with the character
        String before = str.substring(0, pos); // Substring before the position
        String after = str.substring(pos);    // Substring after the position
        return before + ch + after;           // Combine parts with the character in between
    }

    /**
     * Method to insert a character into a string using a custom approach (manual string manipulation).
     * @param str The original string.
     * @param ch The character to insert.
     * @param pos The position at which to insert the character (0-based index).
     * @return The modified string with the character inserted.
     */
    public static String insertCharUsingCustomMethod(String str, char ch, int pos) {
        // Check if the position is valid
        if (pos < 0 || pos > str.length()) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Create a StringBuilder to build the result manually
        StringBuilder result = new StringBuilder();

        // Loop through the string and insert the character at the specified position
        for (int i = 0; i < str.length(); i++) {
            if (i == pos) {
                result.append(ch); // Insert the character at the given position
            }
            result.append(str.charAt(i)); // Append the current character from the original string
        }

        // Handle the case where the position is at the end of the string
        if (pos == str.length()) {
            result.append(ch);
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}
