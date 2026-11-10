package com.amigoscode._4_datastructures._2_arraylist;

// Exercise: ArrayList Basics
// Learn the fundamental operations of ArrayList - Java's resizable array implementation.

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

    static void main(String[] args) {

        //  1 - Create an ArrayList of Strings called 'names'
        List<String> names = new ArrayList<>();

        //  2 - Add 5 names to the list: "Alice", "Bob", "Charlie", "Diana", "Eve"
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");
        System.out.println("names list: " + names);

        //  3 - Get the element at index 2 and print it
        //           Expected output: Charlie
        System.out.println("Element at index 2: " + names.get(2));

        //  4 - Check if the name "Bob" is in the list using contains()
        //           Print the result (true or false)
        System.out.println("does names list contains 'Bob': " + names.contains("Bob"));

        //  5 - Remove the name "Diana" from the list by value
        //           Print the list after removal
        names.remove("Diana");
        System.out.println("names list after removing 'Diana': " + names);

        //  6 - Get and print the size of the list
        System.out.println("Size of names list: " + names.size());

        //  7 - Iterate using a for-each loop and print each name
        //           Format: "Name: <name>"
        names.forEach(e -> System.out.println("Name: " + e));
    }
}
