package com.amigoscode._4_datastructures._3_stacks;

// Exercise: Stack Operations
// Learn how to use the Stack data structure - Last In, First Out (LIFO).

import java.util.Stack;

public class StackExercises {

    static void main(String[] args) {

        //  1 - Create a Stack of Strings called 'stack'
        Stack<String> stack = new Stack<>();

        //  2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");
        System.out.println(stack);

        //  3 - Peek at the top element without removing it
        //           Print the result (should be "Go")
        System.out.println("stack peek: " + stack.peek());

        //  4 - Pop an element from the stack and print it
        //           Then print the stack to see the remaining elements
        System.out.println("stack pop: " + stack.pop());

        //  5 - Check if the stack is empty using isEmpty()
        //           Print the result
        System.out.println("Is stack empty: " + stack.isEmpty());

        // --- String Reversal ---
        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";
        //  6 - Use a Stack to reverse the string 'original'
        //           Push each character onto a stack, then pop them all to build the reversed string
        //           Print both original and reversed strings
        Stack<Character> characterStack = new Stack<>();
        for (char c : original.toCharArray()) {
            characterStack.push(c);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!characterStack.isEmpty()) {
            reversedString.append(characterStack.pop());
        }
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversedString);

        // --- Balanced Brackets ---
        System.out.println("\n--- Balanced Brackets ---");
        String balanced = "({[()]})";
        String unbalanced = "({[})";
        //  7 - Implement a balanced brackets checker
        //           Use a Stack to check if a string of brackets is balanced
        //           For each char: if opening bracket, push it; if closing bracket, check
        //           that the top of stack is the matching opening bracket
        //           Test with both 'balanced' and 'unbalanced' strings
        //           Print whether each string is balanced or not
        System.out.println("is 'balanced' string balanced: " + isBalanced(balanced));
        System.out.println("is 'unbalanced' string balanced: " + isBalanced(unbalanced));

    }

    private static boolean isBalanced(String bracketsString) {
        Stack<Character> bracketStack = new Stack<>();
        for (char c : bracketsString.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                bracketStack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if(bracketStack.isEmpty()) return false;
                if((c == ')' && '(' != bracketStack.pop())
                        || (c == '}' && '{' != bracketStack.pop())
                        || (c == ']' && '[' != bracketStack.pop())) {
                    return false;
                }
            }
        }
        return true;
    }
}
