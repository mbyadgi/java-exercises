package com.amigoscode._5_generics._7_typeerasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Type Erasure
 * <p>
 * Java generics use "type erasure" -- the compiler enforces type safety at
 * compile time, then removes (erases) all generic type information at runtime.
 * This means List<String> and List<Integer> are both just List at runtime.
 * <p>
 * This exercise explores the consequences and limitations of type erasure.
 * <p>
 * Complete the TODOs below.
 */
public class TypeErasureDemo {

    static void main(String[] args) {

        //  1 - Create a List<String> and a List<Integer>.
        //  Add some elements to each. Then compare their getClass() values
        //  using == and print the result.
        //  Example: System.out.println(stringList.getClass() == intList.getClass());
        //  Are they the same class at runtime? Add a comment explaining why.
        List<String> stringList = Arrays.asList("Italy", "Croatia", "Hungary");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        System.out.println(stringList.getClass() == integerList.getClass());
        // They are of same class at runtime because the compiler erases all
        // generic type information at runtime. So List<String> and List<Integer>
        // are both just List at runtime.

        //  2 - Demonstrate that generic type info is lost at runtime.
        //  Print the getClass().getName() of both lists from 1.
        //  Add a comment explaining what you see -- do the class names
        //  include <String> or <Integer>? Why not?
        System.out.println(stringList.getClass());
        System.out.println(integerList.getClass());
        // both the above print statements print java.util.Arrays$ArrayList
        // they do not include <String> or <Integer> because the compiler erases all
        // generic type information at runtime.


        //  3 - Show that instanceof works with raw types but NOT with
        //  parameterized types. Uncomment the code below, observe the error,
        //  then comment it back out. Write the correct version using the raw type.
        //
        // if (stringList instanceof ArrayList<String>) { }  // Does this compile?
        //
        //  Write the working version:
        if (stringList instanceof ArrayList) {
            System.out.println("This works");
        }
        //  Add a comment explaining why you cannot use instanceof with generics.
        //  You cannot use instanceof with parameterized types because generic type info
        //  is erased at runtime.


        //  4 - Show that you cannot create a generic array.
        //  Uncomment the line below and observe the compile error.
        //  Comment it back out and add an explanation.
        //
        // public static <T> T[] createArray(int size) {
        //     return new T[size];  // Why doesn't this compile?
        // }
        //
        //  Explain: Since T is erased at runtime, the JVM would not know
        //  what type of array to create. What workaround exists?
        //  use a collection like ArrayList<T>.


        //  5 - Add a comment below summarizing:
        //  (a) What is type erasure?
        //  (b) When does it happen (compile-time or runtime)?
        //  (c) What are the main limitations it causes?
        //      (List at least 3: instanceof, array creation, and one more)
        //  (d) Why did Java choose type erasure? (Hint: backward compatibility)
        //
        //  (a) Type erasure is the process by which the Java compiler removes
        //  all generic type parameters and replaces them with their bounds.
        //  (b) It happens at compile-time.
        //  (c) It prevents using generic type parameters with instanceof checks and
        //  instantiating generic parameters directly via new T() or
        //  using primitive types as generic type arguments (e.g., List<int>).
        //  (d) Java chose type erasure to maintain backward compatibility.
    }
}