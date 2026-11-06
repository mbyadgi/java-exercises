package com.amigoscode._5_generics._6_wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Unbounded Wildcards (?)
 * <p>
 * The unbounded wildcard <?> represents an unknown type.
 * A List<?> can refer to a list of any type, but you cannot add elements
 * to it (except null) because the compiler does not know the actual type.
 * <p>
 * Complete the TODOs below.
 */
public class UnboundedWildcard {

    //  1 - Create a static method: void printList(List<?> list)
    //  It should iterate through the list and print each element.
    //  Note: elements come out as Object since the type is unknown.
    static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    //  2 - Create a static method: int getSize(List<?> list)
    //  It should return the size of any list, regardless of its type.
    static int getSize(List<?> list) {
        return list.size();
    }

    static void main(String[] args) {

        //  3 - Create three lists:
        //  (a) List<String> with values "Hello", "World"
        //  (b) List<Integer> with values 1, 2, 3
        //  (c) List<Double> with values 1.1, 2.2, 3.3
        //  Call printList() and getSize() with each of them.
        List<String> strings = List.of("Hello", "World");
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        printList(strings);
        System.out.println("String list size: " + getSize(strings));
        printList(integers);
        System.out.println("Integer list size: " + getSize(integers));
        printList(doubles);
        System.out.println("Double list size: " + getSize(doubles));

        //  4 - Demonstrate that you CANNOT add elements to a List<?>.
        //  Uncomment the code below, observe the compile error, then comment
        //  it back out. Add a comment explaining why adding is not allowed.
        //  List<?> unknownList = Arrays.asList("a", "b", "c");
        //  unknownList.add("d");       // Why does this not compile?
        //  unknownList.add(1);         // Why does this not compile either?
        //  Because compiler does not know the type of the list.
        //  The compiler does not know whether unknownList is actually a List<String>,
        //  a List<Integer>, or a List<Double>.

        //  5 - Demonstrate what you CAN do with List<?>:
        //  (a) Get the size
        //  (b) Check if it is empty
        //  (c) Read elements as Object
        //  (d) Remove elements (by index or using clear())
        //  Write code showing at least two of these operations on a List<?>.
        List<?> list = Arrays.asList("Germany", "France", "Spain");
        System.out.println("list list: " + list);
        System.out.println("list list size: " + list.size());
        System.out.println("Is list list empty: " + list.isEmpty());
        for (Object country : list) {
            System.out.println(country);
        }
    }
}
