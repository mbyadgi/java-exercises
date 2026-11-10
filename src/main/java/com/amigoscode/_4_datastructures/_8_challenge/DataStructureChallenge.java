package com.amigoscode._4_datastructures._8_challenge;

// Exercise: Data Structure Challenge
// Combine multiple data structures to solve a real-world problem.
// Manage a collection of students, group them, track recently viewed, and generate reports.

import java.util.*;

public class DataStructureChallenge {

    //  1 - Create a Student record (or class) with three fields:
    //           String name, int grade, String subject
    //           If using a record: record Student(String name, int grade, String subject) {}
    //           If using a class: include constructor, getters, and a toString() method
    record Student(String name, int grade, String subject) {
    }

    static void main(String[] args) {

        //  2 - Create a List of 10 students with various names, grades, and subjects
        //           Use at least 3 different subjects (e.g., "Math", "Science", "English")
        //           Example: new Student("Alice", 92, "Math")
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 92, "Math"));
        students.add(new Student("Bob", 85, "Science"));
        students.add(new Student("Mike", 90, "History"));
        students.add(new Student("Harry", 79, "Math"));
        students.add(new Student("Emma", 98, "English"));
        students.add(new Student("Charlie", 68, "Science"));
        students.add(new Student("Dakota", 86, "English"));
        students.add(new Student("Elle", 95, "History"));
        students.add(new Student("Tom", 81, "Math"));
        students.add(new Student("George", 62, "English"));
        System.out.println("Students list: " + students);

        //  3 - Use a Map<String, List<Student>> to group students by subject
        //           Iterate through the student list
        //           For each student, use computeIfAbsent() to get or create the list for their subject
        //           Then add the student to that list
        //           Print each subject and its students
        Map<String, List<Student>> subjectStudentsMap = new HashMap<>();
        students.forEach(student ->
                subjectStudentsMap.computeIfAbsent(student.subject, key -> new ArrayList<>()).add(student));
        System.out.println("Subject Students Map: " + subjectStudentsMap);

        //  4 - Use a Set<String> to find all unique subjects
        //           Iterate through the students and add each subject to the set
        //           Print the unique subjects
        Set<String> subjects = new HashSet<>();
        students.forEach(student -> subjects.add(student.subject));
        System.out.println("Subjects: " + subjects);

        //  5 - Use a Stack<Student> to track the last 3 students "viewed"
        //           Push any 3 students from the list onto the stack
        //           Then pop and print them to show the viewing history (most recent first)
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(students.get(4));
        studentStack.push(students.get(2));
        studentStack.push(students.get(8));
        System.out.println("Most recent student viewed:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        //  6 - Sort the student list by grade in descending order using a Comparator
        //           Use list.sort() with Comparator.comparingInt() and .reversed()
        //           Print the sorted list
        students.sort(Comparator.comparingInt(Student::grade).reversed());
        System.out.println("Student list sorted in descending order: " + students);

        //  7 - Print a summary report:
        //           - Total number of students
        //           - Number of unique subjects (from the Set)
        //           - Highest grade student (first in sorted list)
        //           - Number of students per subject (from the Map)
        System.out.println("Total number of students: " + students.size());
        System.out.println("Number of unique subjects: " + subjects.size());
        System.out.println("Highest grade student: " + students.getFirst());
        System.out.println("Number of students per subject:");
        subjectStudentsMap.forEach((subject, studentList) -> System.out.println(subject + " : " + studentList.size()));
    }
}
