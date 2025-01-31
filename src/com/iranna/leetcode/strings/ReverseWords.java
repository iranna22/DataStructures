package com.iranna.leetcode.strings;


public class ReverseWords {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        // Use a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add a space between words
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(reverseWords(s2)); // Output: "world hello"
        System.out.println(reverseWords(s3)); // Output: "example good a"
    }
}
