package com.amigoscode._5_generics._5_boundedtypes;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Upper Bounded Type Parameters
 * <p>
 * This exercise demonstrates bounded type parameters using "extends".
 * When you write <T extends Number>, T can only be Number or its subclasses
 * (Integer, Double, Long, etc.). This lets you call Number methods like
 * doubleValue() on values of type T.
 * <p>
 * Complete the TODOs below.
 */
public class UpperBound {

    //  1 - Create a static generic method: <T extends Number> double sum(List<T> list)
    //  It should return the sum of all elements as a double.
    //  Use the doubleValue() method on each element (available because T extends Number).
    static <T extends Number> double sum(List<T> list) {
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }
        return sum;
    }

    //  2 - Create a static generic method: <T extends Number> T findMax(List<T> list)
    //  It should return the largest element in the list.
    //  Compare elements using doubleValue(). If the list is empty, return null.
    static <T extends Number> T findMax(List<T> list) {
        if (list.isEmpty()) return null;
        T largestValue = list.getFirst();
        for (T t : list) {
            if (t.doubleValue() > largestValue.doubleValue()) {
                largestValue = t;
            }
        }
        return largestValue;
    }

    //  3 - Create a generic class NumberBox<T extends Number> with a private T field
    //  called "number" and a constructor that takes T.

    //  4 - In NumberBox, add an isPositive() method that returns true if the
    //  stored number's doubleValue() is greater than 0.

    //  5 - In NumberBox, add toInt() and toDouble() conversion methods that
    //  return the stored number as an int (using intValue()) and as a double
    //  (using doubleValue()) respectively.
    static class NumberBox<T extends Number> {
        private final T number;

        public NumberBox(T number) {
            this.number = number;
        }

        public boolean isPositive() {
            return number.doubleValue() > 0;
        }

        public int toInt() {
            return number.intValue();
        }

        public double toDouble() {
            return number.doubleValue();
        }
    }

    static void main(String[] args) {

        //  6 - Test sum() and findMax() with:
        //  (a) A List<Integer> e.g., Arrays.asList(1, 2, 3, 4, 5)
        //  (b) A List<Double> e.g., Arrays.asList(1.5, 2.5, 3.5)
        //  Print the results for each.
        //  Also create a NumberBox<Integer> and NumberBox<Double> and test
        //  isPositive(), toInt(), and toDouble().
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("sum of integers: " + sum(integers));
        System.out.println("sum of doubles: " + sum(doubles));
        System.out.println("max in integers: " + findMax(integers));
        System.out.println("max in doubles: " + findMax(doubles));

        NumberBox<Integer> integerNumberBox = new NumberBox<>(25);
        System.out.println("integerNumberBox isPositive(): " + integerNumberBox.isPositive());
        System.out.println("integerNumberBox toInt(): " + integerNumberBox.toInt());
        System.out.println("integerNumberBox toDouble(): " + integerNumberBox.toDouble());

        NumberBox<Double> doubleNumberBox = new NumberBox<>(38.51);
        System.out.println("doubleNumberBox isPositive(): " + doubleNumberBox.isPositive());
        System.out.println("doubleNumberBox toInt(): " + doubleNumberBox.toInt());
        System.out.println("doubleNumberBox toDouble(): " + doubleNumberBox.toDouble());

        //  7 - Uncomment the line below and observe the compile error.
        //  Then comment it back out and add a comment explaining why it fails.
        //  List<String> strings = Arrays.asList("a", "b");
        //  double result = sum(strings);  // Why does this not compile?
        //  it fails because the Type Parameter of sum() method is bounded to Number, 
        //  so it cannot accept String variables

    }
}
