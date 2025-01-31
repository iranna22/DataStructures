package com.iranna.leetcode.strings;


public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        // If lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create an array to count character frequencies
        int[] charCount = new int[26]; // For lowercase English letters only
        
        // Increment for characters in s and decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        
        boolean result = isAnagram(s, t);
        System.out.println("Is anagram: " + result);
    }
}
