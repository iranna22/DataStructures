package com.iranna.leetcode.strings;


public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if input is null or empty
        }

        String prefix = strs[0]; // Start with the first string as the prefix

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix by checking with the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // Return empty string if no common prefix is found
                }
            }
        }

        return prefix; // Return the final common prefix
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(strs)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(strs2)); // Output: ""
    }
}
