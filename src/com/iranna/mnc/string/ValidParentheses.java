package com.iranna.mnc.string;
//LEETCODE

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>(); 

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); 
            } 
            // If it's a closing bracket
            else {
                // Check if the stack is empty (no matching opening bracket)
                if (stack.isEmpty()) { 
                    return false;
                }

                char top = stack.pop(); // Pop the top element from the stack

                // Check for matching bracket pairs
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // After iterating, the stack should be empty 
        // if all brackets have been correctly matched
        return stack.isEmpty(); 
    }
    
    public static boolean isValidWithoutBuiltIn(String s) {
        String stack = ""; // Use a string to simulate a stack (LIFO)

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack += c; // Push onto the stack
            } else {
                if (stack.isEmpty()) { 
                    return false;
                }
                char top = stack.charAt(stack.length() - 1); // Get the top element
                stack = stack.substring(0, stack.length() - 1); // Pop from the stack
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()"; 
        String s2 = "()[]{)";
        String s3 = "(]"; 

        System.out.println(s1 + " is valid: " + isValid(s1)); 
        System.out.println(s2 + " is valid: " + isValid(s2)); 
        System.out.println(s3 + " is valid: " + isValid(s3)); 
        System.out.println(s1 + " is valid: " + isValidWithoutBuiltIn(s1)); 
        System.out.println(s2 + " is valid: " + isValidWithoutBuiltIn(s2)); 
        System.out.println(s3 + " is valid: " + isValidWithoutBuiltIn(s3)); 
    }
}