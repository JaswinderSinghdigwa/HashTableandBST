	package com.bl.hashTable;
	
	/**
	 * Purpose  - To Removing word in HashMap
	 * @author  - JaswinderSingh
	 * @version - 16.0
	 * @since   - 30-09-2021
	 */
	
	public class HashTable {
	
	    public static void main(String[] args) {
	        HashTableImplementation<String, Integer> hashTable = new HashTableImplementation<String, Integer>();
	        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
	
	        // Split the words when a white space comes up and Convert all the words in lowercase
	        String[] paragraphArray =	paragraph.toLowerCase().split(" ");
	
	        for (String word : paragraphArray) {
	            // Search for the word in the linked list
	            Integer value = hashTable.get(word);
	            // If not found, frequency of the word StayWith 1
	            if (value == null)
	                value = 1;
	            else   // If found, frequency of the word increases by 1
	            	value = value + 1;
	            hashTable.add(word, value);
	        }
	        hashTable.remove("avoidable");
	        System.out.println(hashTable);
	    }
	}