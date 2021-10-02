package com.bl.hashTable;

/**
 * Purpose  - To add values in Binary Search Tree and check whether 63 is present.
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 30-09-2021
 */

public class HashTable {

    public static void main(String[] args) {
        HashTableImplementation<String, Integer> hashTable = new HashTableImplementation<String, Integer>();
        String message = "To be or not to be";

        // Split the words when a white space comes up and Convert all the words in lowercase
        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray) {
            // Search for the word in the linked list
            Integer value = hashTable.get(word);
            // If not found, frequency of the word StayWith 1
            if (value == null)
                value = 1;
            else   // If found, frequency of the word increases by 1
            	value = value + 1;
            hashTable.add(word, value);
        }
        System.out.println(hashTable);
    }
}