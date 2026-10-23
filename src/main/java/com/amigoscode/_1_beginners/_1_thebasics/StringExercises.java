package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Strings
 * <p>
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class StringExercises {

    static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        System.out.println("message: " + message);
        System.out.println("message length: " + message.length());

        // Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        System.out.println("message to uppercase: " + message.toUpperCase());
        System.out.println("message to lowercase: " + message.toLowerCase());

        // Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        System.out.println("first 5 characters of message: " + message.substring(0, 5));

        // Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        System.out.println("message contains Amigoscode: " + message.contains("Amigoscode"));

        // Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        System.out.println("replace Amigoscode with Java in message: " + message.replace("Amigoscode", "Java"));

        // Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()
        System.out.println("padded string: " + padded);
        System.out.println("padded trimmed: " + padded.trim());

        // Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array
        System.out.println("csv string: " + csv);
        System.out.println("split csv: ");
        String[] csvArray = csv.split(",");
        for (int i = 0; i < csvArray.length; i++) {
            System.out.println(csvArray[i]);
        }

        // Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.
        String first = new String("Awesome");
        String second = new String("Awesome");
        System.out.println("first string: " + first);
        System.out.println("second string: " + second);
        System.out.println("first.equals(second): " + first.equals(second));
        System.out.println("first == second: " + (first == second));
        System.out.println(".equals checks content where as == checks the actual values and since string variables are reference variables == may not always work");
    }
}
