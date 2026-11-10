package com.amigoscode._4_datastructures._6_sets;

// Exercise: TreeSet Operations
// Learn how to use TreeSet - a sorted set implementation backed by a TreeMap.

import java.util.TreeSet;

public class TreeSetExercises {

    static void main(String[] args) {

        //  1 - Create a TreeSet of Integers called 'numbers'
        TreeSet<Integer> numbers = new TreeSet<>();

        //  2 - Add these elements: 50, 20, 40, 10, 30, 60, 15, 45
        //           Print the set and observe that elements are automatically sorted
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(60);
        numbers.add(15);
        numbers.add(45);
        System.out.println("numbers set: " + numbers);

        //  3 - Get and print the first (lowest) element using first()
        //           Get and print the last (highest) element using last()
        System.out.println("first element in numbers set: " + numbers.first());
        System.out.println("last element in numbers set: " + numbers.last());

        //  4 - Get a subset of elements from 20 (inclusive) to 45 (exclusive) using subSet()
        //           Print the subset
        System.out.println("subset of numbers: " + numbers.subSet(20, 45));

        //  5 - Get and print the headSet (elements less than 30)
        //           Get and print the tailSet (elements greater than or equal to 30)
        System.out.println("headSet to 30: " + numbers.headSet(30));
        System.out.println("tailSet from 30: " + numbers.tailSet(30));

        //  6 - Iterate over the TreeSet using a for-each loop
        //           Print each element and observe the natural ascending order
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
