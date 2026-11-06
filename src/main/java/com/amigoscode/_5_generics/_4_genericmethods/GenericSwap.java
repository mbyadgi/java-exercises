package com.amigoscode._5_generics._4_genericmethods;

import java.util.Arrays;

/**
 * Exercise: Generic Swap and Reverse
 * <p>
 * This exercise practices generic methods by implementing swap and reverse
 * operations that work with arrays of any type.
 * <p>
 * Complete the TODOs below.
 */
public class GenericSwap {

    //  1 - Create a static generic method: <T> void swap(T[] array, int i, int j)
    //  It should swap the elements at indices i and j in the array.
    //  Use a temporary variable of type T to perform the swap.
    static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //  2 - Create a static generic method: <T> T[] reverse(T[] array)
    //  It should reverse the array in place and return it.
    //  Hint: swap elements from both ends, moving toward the center.
    //  Use the swap() method you wrote in 1.
    static <T> T[] reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            swap(array, left++, right--);
        }
        return array;
    }

    static void main(String[] args) {

        //  3 - Create an Integer[] array {1, 2, 3, 4, 5}.
        //  Use swap() to swap the first and last elements.
        //  Print the result using Arrays.toString().
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(nums));
        swap(nums, 0, nums.length - 1);
        System.out.println("After swap first and last elements: " + Arrays.toString(nums));

        //  4 - Create a String[] array {"A", "B", "C", "D"}.
        //  Use swap() to swap elements at index 1 and index 2.
        //  Print the result using Arrays.toString().
        String[] alphabets = {"A", "B", "C", "D"};
        System.out.println("Before swap: " + Arrays.toString(alphabets));
        swap(alphabets, 1, 2);
        System.out.println("After swap at index 1 and index 2: " + Arrays.toString(alphabets));

        //  5 - Use reverse() on both the Integer[] and String[] arrays.
        //  Print the reversed arrays using Arrays.toString().
        //  Verify the output is correct.
        System.out.println("nums reversed: " + Arrays.toString(reverse(nums)));
        System.out.println("alphabets reversed: " + Arrays.toString(reverse(alphabets)));
    }
}
