package com.amigoscode._4_datastructures._1_arrays;

// Exercise: Array Basics
// Learn how to create, manipulate, and search through arrays in Java.

import java.util.Arrays;

public class ArrayBasics {

    static void main(String[] args) {

        //  1 - Create an int array of size 5
        int[] intArray = new int[5];

        //  2 - Fill the array with values 10, 20, 30, 40, 50 using a for loop
        //           (hint: use i * 10 + 10 or similar pattern)
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10 + 10;
        }

        //  3 - Print all elements of the array using Arrays.toString()
        System.out.println("intArray: " + Arrays.toString(intArray));

        //  4 - Find the maximum value in the array
        //           Iterate through the array and track the largest value found
        int max = intArray[0];
        for (int num : intArray) {
            if (num > max) max = num;
        }
        System.out.println("Largest value in intArray: " + max);

        //  5 - Find the minimum value in the array
        //           Iterate through the array and track the smallest value found
        int min = intArray[0];
        for (int num : intArray) {
            if (num < min) min = num;
        }
        System.out.println("Smallest value in intArray: " + min);

        //  6 - Sort the array using Arrays.sort()
        //           Then print the sorted array
        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));

        //  7 - Use Arrays.binarySearch() to find the index of value 30
        //           Note: the array must be sorted before using binarySearch
        //           Print the index where the value was found
        System.out.println("Index of 30 in intArray: " + Arrays.binarySearch(intArray, 30));
    }
}
