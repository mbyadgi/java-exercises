package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Operators
 * <p>
 * Learn how to use arithmetic, comparison, logical, and other operators in Java.
 * Operators allow you to perform operations on variables and values.
 */
public class Operators {

    static void main(String[] args) {

        // Use arithmetic operators (+, -, *, /) on two int variables and print the results
        // Declare two int variables (e.g., a = 10, b = 3)
        // Print the result of a + b, a - b, a * b, and a / b
        int a = 35;
        int b = 6;
        System.out.println("a: " + a + " | b: " + b);
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));

        // Use the modulus operator (%) to check if a number is even
        // Declare an int variable called number with any value.
        // Print the result of number % 2
        // Print whether the number is even (result is 0) or odd (result is 1)
        int number = 55;
        int result = number % 2;
        System.out.println("number: " + number);
        System.out.println("number % 2: " + result);
        if (result == 0) {
            System.out.println("number is even");
        } else if (result == 1) {
            System.out.println("number is odd");
        }

        // Use increment (++) and decrement (--) operators
        // Declare an int variable called counter, set it to 5
        // Use counter++ and print the result, then use counter-- and print the result
        int counter = 5;
        System.out.println("counter: " + counter);
        System.out.println("counter++: " + counter++);
        System.out.println("counter--: " + counter--);

        // Use compound assignment operators (+=, -=, *=)
        // Declare an int variable called score, set it to 10
        // Use +=, -=, and *= on score, printing after each operation
        int score = 10;
        System.out.println("score: " + score);
        System.out.println("score += 2: " + (score += 2));
        System.out.println("score -= 3: " + (score -= 3));
        System.out.println("score *= 4: " + (score *= 4));

        // Use comparison operators (==, !=, >, <, >=, <=) and print the boolean results
        // Declare two int variables (e.g., x = 5, y = 10)
        // Print the result of each comparison, e.g.: System.out.println("x == y: " + (x == y));
        int x = 5;
        int y = 10;
        System.out.println("x: " + x + " | y: " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        // Use logical operators (&&, ||, !) to combine conditions
        // Declare two boolean variables (e.g., hasLicense = true, hasInsurance = false)
        // Print the result of: hasLicense && hasInsurance
        // Print the result of: hasLicense || hasInsurance
        // Print the result of: !hasLicense
        boolean hasLicense = true;
        boolean hasInsurance = false;
        System.out.println("hasLicense: " + hasLicense + " | hasInsurance: " + hasInsurance);
        System.out.println("hasLicense && hasInsurance: " + (hasLicense && hasInsurance));
        System.out.println("hasLicense || hasInsurance: " + (hasLicense || hasInsurance));
        System.out.println("!hasLicense: " + !hasLicense);

        // Use the ternary operator to assign "adult" or "minor" based on age
        // Declare an int variable called age with any value
        // Use the ternary operator: String status = (condition) ? "adult" : "minor";
        // Print the status
        int age = 34;
        String status = (age > 18) ? "adult" : "minor";
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
    }
}
