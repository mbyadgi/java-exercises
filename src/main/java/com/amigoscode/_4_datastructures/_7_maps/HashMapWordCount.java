package com.amigoscode._4_datastructures._7_maps;

// Exercise: Word Frequency Counter using HashMap
// A practical exercise to count word occurrences in a sentence.

import java.util.*;

public class HashMapWordCount {

    static void main(String[] args) {

        String sentence = "the cat sat on the mat and the cat ate the rat on the mat";

        //  1 - Split the sentence into an array of words using split(" ")
        String[] words = sentence.split(" ");

        //  2 - Create a HashMap<String, Integer> called 'wordCount'
        //           Iterate through the words array and count the frequency of each word
        //           Hint: use getOrDefault(word, 0) + 1 to increment the count
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("wordCount map: " + wordCount);

        //  3 - Print each word and its count by iterating over the map
        //           Format: "<word>: <count>"
        wordCount.forEach((key, value) -> System.out.println(key + " : " + value));

        //  4 - Find and print the most frequent word
        //           Iterate through the entrySet and track the entry with the highest value
        Map.Entry<String, Integer> mostFrequent = null;
        for (Map.Entry<String, Integer> wordCountEntry : wordCount.entrySet()) {
            if (mostFrequent == null || wordCountEntry.getValue() > mostFrequent.getValue()) {
                mostFrequent = wordCountEntry;
            }
        }
        System.out.println("Most frequent word: " + mostFrequent.getKey() + ", with count: " + mostFrequent.getValue());

        //  5 - Find and print all words that appear only once
        //           Iterate through the entrySet and collect entries where value == 1
        Set<String> wordsWithCountOne = new HashSet<>();
        for (Map.Entry<String, Integer> wordCountEntry : wordCount.entrySet()) {
            if (wordCountEntry.getValue() == 1) wordsWithCountOne.add(wordCountEntry.getKey());
        }
        System.out.println("Words that appear only once: " + wordsWithCountOne);

        //  6 - Sort the map entries by value (frequency) in descending order and print
        //           Hint: create a List from entrySet(), then sort using a Comparator
        //           that compares entry values in reverse order
        List<Map.Entry<String, Integer>> wordCountList = new ArrayList<>(wordCount.entrySet());
        System.out.println("Before sorting: " + wordCountList);
        wordCountList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println("After sorting: " + wordCountList);
    }
}
