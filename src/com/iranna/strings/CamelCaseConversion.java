package com.iranna.strings;

public class CamelCaseConversion {

    public static void main(String[] args) {
        String sentence = "hello world this is camel case";
        
        // Approach 1: Using Built-in Methods
        String camelCaseWithBuiltInMethods = convertToCamelCaseWithBuiltInMethods(sentence);
        System.out.println("Camel Case (using built-in methods): " + camelCaseWithBuiltInMethods);
        
        // Approach 2: Without Using Built-in Methods
        String camelCaseWithoutBuiltInMethods = convertToCamelCaseWithoutBuiltInMethods(sentence);
        System.out.println("Camel Case (without using built-in methods): " + camelCaseWithoutBuiltInMethods);
    }

    // Method for converting to Camel Case using built-in methods
    public static String convertToCamelCaseWithBuiltInMethods(String sentence) {
        // Step 1: Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");
        
        // Step 2: Create a StringBuilder to store the result
        StringBuilder camelCaseString = new StringBuilder();
        
        // Step 3: Loop through each word and process it
        for (int i = 0; i < words.length; i++) {
            // Step 4: First word should stay lowercase
            if (i == 0) {
                camelCaseString.append(words[i]);
            } else {
                // Step 5: For subsequent words, capitalize the first letter and add the rest
                camelCaseString.append(words[i].substring(0, 1).toUpperCase());
                camelCaseString.append(words[i].substring(1));
            }
        }

        // Step 6: Return the final camel case string
        return camelCaseString.toString();
    }

    // Method for converting to Camel Case without using built-in methods
    public static String convertToCamelCaseWithoutBuiltInMethods(String sentence) {
        // Step 1: Initialize an empty result string
        StringBuilder camelCaseString = new StringBuilder();
        
        // Step 2: Traverse each character in the sentence
        boolean isSpace = true; // Flag to track space (first character of the word)
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Step 3: If the character is a space, mark the next character as the start of a new word
            if (currentChar == ' ') {
                isSpace = true;
            } else {
                // Step 4: If it is the first character of the word, capitalize it
                if (isSpace) {
                    camelCaseString.append(Character.toUpperCase(currentChar));
                    isSpace = false;
                } else {
                    // Step 5: If not the first character, keep it as lowercase
                    camelCaseString.append(Character.toLowerCase(currentChar));
                }
            }
        }

        // Step 6: Return the final camel case string
        return camelCaseString.toString();
    }
}
