package com.iranna.strings;


public class StringComparison {

    // Custom method to check if two strings are the same
    public static boolean areStringsEqual(String str1, String str2) {
        // If lengths are different, strings are not the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test strings
        String string1 = "Hello";
        String string2 = "Hello";

        // Using built-in method
        boolean isEqualBuiltIn = string1.equals(string2);
        System.out.println("Using built-in method: " + (isEqualBuiltIn ? "Strings are same" : "Strings are not same"));

        // Using custom method
        boolean isEqualCustom = areStringsEqual(string1, string2);
        System.out.println("Using custom method: " + (isEqualCustom ? "Strings are same" : "Strings are not same"));
    }
}
