package com.amigoscode._5_generics._4_genericmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Generic Methods
 * <p>
 * This exercise focuses on writing static generic methods.
 * Generic methods declare their own type parameters independently
 * of any generic class. The type parameter appears before the return type.
 * <p>
 * Complete the TODOs below.
 */
public class GenericMethods {

    //  1 - Create a static generic method: <T> void printArray(T[] array)
    //  It should print each element of the array on the same line separated
    //  by spaces, then print a newline at the end.
    static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    //  2 - Create a static generic method: <T> T getFirst(List<T> list)
    //  It should return the first element of the list.
    //  If the list is empty, return null.
    static <T> T getFirst(List<T> list) {
        return list.isEmpty() ? null : list.getFirst();
    }

    //  3 - Create a static generic method: <T> T getLast(List<T> list)
    //  It should return the last element of the list.
    //  If the list is empty, return null.
    static <T> T getLast(List<T> list) {
        return list.isEmpty() ? null : list.getLast();
    }

    //  4 - Create a static generic method: <T> List<T> filterNulls(List<T> list)
    //  It should return a new list containing only the non-null elements
    //  from the original list. Do not modify the original list.
    static <T> List<T> filerNulls(List<T> list) {
        List<T> newList = new ArrayList<>();
        for (T t : list) {
            if (t != null) {
                newList.add(t);
            }
        }
        return newList;
    }

    //  5 - Create a static generic method: <T> boolean contains(T[] array, T target)
    //  It should return true if the target is found in the array.
    //  Use the equals() method for comparison (handle null target).
    static <T> boolean contains(T[] array, T target) {
        if (target == null) return false;
        for (T t : array) {
            if (t.equals(target)) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {

        //  6 - Call all five methods above:
        //  (a) printArray with a String[] and an Integer[]
        //  (b) getFirst and getLast with a List<String> of names
        //  (c) filterNulls with a list that contains some null values
        //  (d) contains to search for an element in an array
        String[] strings = {"Java", "Python", "Rust"};
        Integer[] integers = {1, 2, 3, 4};
        printArray(strings);
        printArray(integers);

        List<String> names = List.of("Clark", "Bruce", "Diana");
        System.out.println("First element in names: " + getFirst(names));
        System.out.println("Last element in names: " + getLast(names));

        List<String> nullList = Arrays.asList("Clark", null, null, "Bruce", "Diana", null);
        System.out.println("List containing null: " + nullList);
        System.out.println("Filtered list: " + filerNulls(nullList));

        System.out.println("String array contains Python: " + contains(strings, "Python"));

        //  7 - Demonstrate type inference: call printArray and contains
        //  WITHOUT explicitly specifying the type parameter (i.e., just call
        //  printArray(myArray) instead of GenericMethods.<String>printArray(myArray)).
        //  Add a comment explaining that the compiler infers T from the arguments.
        printArray(strings);
        System.out.println(contains(strings, "Python"));
    }
}
