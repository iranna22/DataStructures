package com.iranna.strings;


public class InsertStringInString {

    public static void main(String[] args) {
        // Input strings and position
        String originalString = "HelloWorld";
        String stringToInsert = "Beautiful ";
        int position = 5;

        // Using built-in methods
        System.out.println("Using built-in methods:");
        String resultBuiltIn = insertStringUsingBuiltIn(originalString, stringToInsert, position);
        System.out.println("Result: " + resultBuiltIn);

        // Using custom method
        System.out.println("\nUsing custom method:");
        String resultCustom = insertStringUsingCustomMethod(originalString, stringToInsert, position);
        System.out.println("Result: " + resultCustom);
    }

    /**
     * Method to insert a string into another string using built-in methods.
     * @param original The original string.
     * @param toInsert The string to insert.
     * @param pos The position at which to insert the string (0-based index).
     * @return The modified string with the inserted string.
     */
    public static String insertStringUsingBuiltIn(String original, String toInsert, int pos) {
        // Validate the position
        if (pos < 0 || pos > original.length()) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Split the original string using substring and concatenate the parts
        String before = original.substring(0, pos);  // Substring before the position
        String after = original.substring(pos);     // Substring after the position
        return before + toInsert + after;           // Combine with the string to insert
    }

    /**
     * Method to insert a string into another string using a custom approach (manual string manipulation).
     * @param original The original string.
     * @param toInsert The string to insert.
     * @param pos The position at which to insert the string (0-based index).
     * @return The modified string with the inserted string.
     */
    public static String insertStringUsingCustomMethod(String original, String toInsert, int pos) {
        // Validate the position
        if (pos < 0 || pos > original.length()) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Create a StringBuilder to build the result manually
        StringBuilder result = new StringBuilder();

        // Loop through the original string and insert the new string at the specified position
        for (int i = 0; i < original.length(); i++) {
            if (i == pos) {
                result.append(toInsert); // Insert the string at the given position
            }
            result.append(original.charAt(i)); // Append the current character from the original string
        }

        // Handle the case where the position is at the end of the string
        if (pos == original.length()) {
            result.append(toInsert);
        }

        return result.toString(); // Convert StringBuilder to String and return
    }
}
