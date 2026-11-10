package com.amigoscode._4_datastructures._6_sets;

// Exercise: HashSet Operations
// Learn how to use HashSet - an unordered collection that contains no duplicate elements.

import java.util.*;

public class HashSetExercises {

    static void main(String[] args) {

        //  1 - Create a HashSet of Strings called 'fruits'
        Set<String> fruits = new HashSet<>();

        //  2 - Add elements: "Apple", "Banana", "Cherry", "Apple", "Date", "Banana"
        //           Print the set after adding all elements
        //           Observe that duplicates are automatically ignored
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Date");
        fruits.add("Banana");
        System.out.println("fruits set: " + fruits);

        //  3 - Check if "Cherry" exists in the set using contains()
        //           Print the result
        System.out.println("Does 'Cherry' exits in fruits set: " + fruits.contains("Cherry"));

        //  4 - Remove "Date" from the set
        //           Print the set after removal
        fruits.remove("Date");
        System.out.println("fruits set after removing 'Date': " + fruits);

        //  5 - Get and print the size of the set
        System.out.println("Size of fruits set: " + fruits.size());

        //  6 - Iterate over the set using a for-each loop and print each element
        //           Note: the order may not match insertion order (HashSet is unordered)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // --- Removing Duplicates from a List ---
        System.out.println("\n--- Removing Duplicates ---");
        List<String> listWithDuplicates = new ArrayList<>(
                Arrays.asList("Java", "Python", "Java", "C++", "Python", "Go", "Java")
        );
        System.out.println("Original list: " + listWithDuplicates);

        //  7 - Use a HashSet to remove duplicates from 'listWithDuplicates'
        //           Create a new HashSet from the list, then create a new ArrayList from the set
        //           Print the deduplicated list
        Set<String> setFromList = new HashSet<>(listWithDuplicates);
        List<String> deduplicatedList = new ArrayList<>(setFromList);
        System.out.println("deduplicated list: " + deduplicatedList);
    }
}
