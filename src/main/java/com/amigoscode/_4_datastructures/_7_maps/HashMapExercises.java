package com.amigoscode._4_datastructures._7_maps;

// Exercise: HashMap Operations
// Learn how to use HashMap - a key-value pair data structure for fast lookups.

import java.util.HashMap;
import java.util.Map;

public class HashMapExercises {

    static void main(String[] args) {

        //  1 - Create a HashMap<String, Integer> called 'studentGrades'
        //           This will store student names as keys and their grades as values
        Map<String, Integer> studentGrades = new HashMap<>();

        //  2 - Put 5 entries into the map:
        //           "Alice" -> 92, "Bob" -> 85, "Charlie" -> 78, "Diana" -> 95, "Eve" -> 88
        studentGrades.put("Alice", 92);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 95);
        studentGrades.put("Eve", 88);
        System.out.println("studentGrades map: " + studentGrades);

        //  3 - Get the grade for "Charlie" using get() and print it
        System.out.println("grade for 'Charlie': " + studentGrades.get("Charlie"));

        //  4 - Check if the key "Bob" exists using containsKey()
        //           Print the result
        System.out.println("does key 'Bob' exists: " + studentGrades.containsKey("Bob"));

        //  5 - Check if the value 95 exists using containsValue()
        //           Print the result
        System.out.println("does value 95 exists: " + studentGrades.containsValue(95));

        //  6 - Remove the entry for "Eve" using remove()
        //           Print the map after removal
        studentGrades.remove("Eve");
        System.out.println("studentGrades map after removal of key 'Eve': " + studentGrades);

        //  7 - Iterate over the entrySet() using a for-each loop
        //           Print each entry in the format: "Student: <name>, Grade: <grade>"
        for (Map.Entry<String, Integer> studentGradesEntry : studentGrades.entrySet()) {
            System.out.println("Student: " + studentGradesEntry.getKey() + ", Grade: " + studentGradesEntry.getValue());
        }

        //  8 - Iterate over just the keys using keySet() and print them
        //           Then iterate over just the values using values() and print them
        for (String student : studentGrades.keySet()) {
            System.out.println(student);
        }
        for (Integer grade : studentGrades.values()) {
            System.out.println(grade);
        }
    }
}
