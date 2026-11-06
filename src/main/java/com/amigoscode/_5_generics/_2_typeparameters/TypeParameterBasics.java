package com.amigoscode._5_generics._2_typeparameters;

/**
 * Exercise: Type Parameter Basics
 * <p>
 * This exercise introduces generic type parameters.
 * You will create a simple generic Container class that can hold
 * any type of object while maintaining type safety.
 * <p>
 * Complete the TODOs below to build and test your generic Container.
 */
public class TypeParameterBasics {

    //  1 - Declare a generic class Container<T> with a single private field
    //  of type T called "value".

    //  2 - Add a constructor to Container that takes a parameter of type T
    //  and assigns it to the "value" field.

    //  3 - Add a getter method "T getValue()" and a setter method
    //  "void setValue(T value)" to the Container class.

    //  4 - Add a toString() method to Container that returns
    //  "Container{value=" + value + "}".
    static class Container<T> {
        private T value;

        public Container(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Container{" +
                    "value=" + value +
                    '}';
        }
    }

    static void main(String[] args) {
        //  5 - Create two Container instances:
        //  (a) Container<String> holding the value "Java Generics"
        //  (b) Container<Integer> holding the value 2024
        //  Print both containers using toString().
        Container<String> stringContainer = new Container<>("Java Generics");
        Container<Integer> integerContainer = new Container<>(2024);
        System.out.println(stringContainer);
        System.out.println(integerContainer);

        //  6 - Demonstrate type safety: try to call setValue(123) on the
        //  Container<String> instance. Comment it out and explain why the
        //  compiler rejects it. Then call setValue with a valid String and
        //  print the updated container.
        //  stringContainer.setValue(123);
        //  since the Type Parameter of this Container is set as String,
        //  the setValue() method will only accept a valid String.
        stringContainer.setValue("Hello");
    }
}