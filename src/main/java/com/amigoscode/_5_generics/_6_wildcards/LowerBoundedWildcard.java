package com.amigoscode._5_generics._6_wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Lower Bounded Wildcards (? super T)
 * <p>
 * A lower bounded wildcard <? super Integer> accepts Integer and all its
 * supertypes (Number, Object). This is useful when you want to WRITE to
 * a generic structure.
 * <p>
 * PECS principle: Producer Extends, Consumer Super.
 * When a list CONSUMES values (you write to it), use "super".
 * <p>
 * Complete the TODOs below.
 */
public class LowerBoundedWildcard {

    //  1 - Create a static method: void addNumbers(List<? super Integer> list)
    //  It should add the integers 1, 2, and 3 to the list.
    //  This works because any list that holds Integer or a supertype of Integer
    //  can safely accept Integer values.
    static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    //  2 - Create a static method:
    //  <T> void moveElements(List<? extends T> source, List<? super T> destination)
    //  It should read each element from source and add it to destination.
    //  This is the PECS principle in action:
    //    source uses "extends" because it PRODUCES elements (we read from it)
    //    destination uses "super" because it CONSUMES elements (we write to it)
    static <T> void moveElements(List<? extends T> source, List<? super T> destination) {
        for (T t : source) {
            destination.add(t);
        }
    }

    static void main(String[] args) {

        //  3 - Call addNumbers() with three different list types:
        //  (a) List<Integer>   - Integer is Integer (exact match)
        //  (b) List<Number>    - Number is a supertype of Integer
        //  (c) List<Object>    - Object is a supertype of Integer
        //  Print each list after calling addNumbers().
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        addNumbers(integers);
        addNumbers(numbers);
        addNumbers(objects);
        System.out.println("Integer list: " + integers);
        System.out.println("Number list: " + numbers);
        System.out.println("Object list: " + objects);

        //  4 - Demonstrate that you CAN add Integer to List<? super Integer>.
        //  Create a List<? super Integer> variable, assign a new ArrayList<Number>()
        //  to it, and add several Integer values. Print the list.
        List<? super Integer> list = new ArrayList<>();
        addNumbers(list);
        System.out.println("List<? super Integer> list: " + list);
        //  Then try adding a Double and observe/explain the compile error (commented out).
        //
        // list.add(3.14);  // Why doesn't this compile even though list holds Numbers?
        // because the list is lower bounded to Integer meaning you can add only Integer or its Super types.


        //  5 - Use moveElements() to move elements from a List<Integer> source
        //  to a List<Number> destination. Print the destination list to verify.
        moveElements(integers, numbers);
        System.out.println("Number list after moving elements: " + numbers);

        //  6 - Add a comment below explaining the PECS principle
        //  (Producer Extends, Consumer Super) as it applies to this exercise.
        //  Why is "super" appropriate when the list is a CONSUMER (we write to it)?
        //  How does this complement the "extends" wildcard?
        //  because it establishes a lower bound, guaranteeing that the underlying collection
        //  is capable of holding elements of your target type.
        //  extends and super are exact opposites of each other.
    }
}
