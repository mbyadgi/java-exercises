package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    static void main(String[] args) {

        //  1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> intArrayList = new ArrayList<>();
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        for (int i = 0; i < 10_000; i++) {
            intArrayList.add(i);
            intLinkedList.add(i);
        }

        //  2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        double start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intArrayList.add(0, i);
        }
        double end = System.nanoTime();
        System.out.println("Time taken for array list add(0, value) operation: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intLinkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("Time taken for linked list add(0, value) operation: " + (end - start) / 1_000_000 + " ms");

        //  3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intArrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken for array list add(value) operation: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intLinkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Time taken for linked list add(value) operation: " + (end - start) / 1_000_000 + " ms");

        //  4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intArrayList.get(intArrayList.size() / 2);
        }
        end = System.nanoTime();
        System.out.println("Time taken for array list get operation: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            intLinkedList.get(intLinkedList.size() / 2);
        }
        end = System.nanoTime();
        System.out.println("Time taken for linked list get operation: " + (end - start) / 1_000_000 + " ms");

        //  5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("LinkedList is faster for insertions at the beginning because it only updates a few node pointers, " +
                "whereas an ArrayList must shift every existing element down by one position");
        System.out.println("ArrayList is faster for random access because its elements are stored in contiguous memory, " +
                "allowing direct index calculation, whereas a LinkedList must traverse nodes sequentially from the head or tail " +
                "to reach the requested index");
        System.out.println("Choose ArrayList when you need frequent random access and primarily add elements to the end, " +
                "but choose LinkedList when you need to do frequent insertions or deletions at the beginning or middle of the list");
    }
}
