	package com.bl.hashTable;
	
	import java.util.ArrayList;
	
	public class HashTableImplementation<K, V> {
	    private static final String ArrayofBuckets = null;
		Node head;
	    Node tail;
	    private final int Bucket;
	    ArrayList<Node<K,V>> ArrayOfBuckets;
	    
	    public HashTableImplementation() {
	        this.Bucket = 10;
	
	        // Create empty LinkedLists
	        for (int i = 0; i < Bucket; i++)
	            this.ArrayOfBuckets.add(null);
	    }
	
	    public void add(K key, V value) {
	        Node<K, V> myNode = searchNode(key);
	        if (myNode == null) {
	            myNode = new Node<>(key, value);
	            this.append(myNode);
	        } else {
	            myNode.setValue(value);
	        }
	    }
	   
	
	    // Append the value in the linked list
	    public void append(Node myNode) {
	        if (this.head == null)
	            this.head = myNode;
	        if (this.tail == null)
	            this.tail = myNode;
	        else {
	            this.tail.setNext(myNode);
	            this.tail = myNode;
	        }
	    }
	
	    // Searching for the word in the linked list
	    public Node<K, V> searchNode(K data) {
	        Node currentNode = head;
	        int position = 0;
	        while (currentNode != null) {
	            position++;
	            if (currentNode.getKey().equals(data)) {
	                return currentNode;
	            }
	            currentNode = currentNode.getNext();
	        }
	        return currentNode;
	    }
	
	    // Searching for the word and get the value from the linked list
	    public V get(K word) {
	    	int index = this.getBucketIndex(word);
	        if (this.ArrayOfBuckets.get(index) == null)
	            return null;
	        Node<K, V> myMapNode = searchNode(word);
	        if (myMapNode == null) {
	            return null;
	        } else {
	            return myMapNode.getValue();
	        }
	
	    }
	   
	
	// This implements hash function to find index for a key
	    public int getBucketIndex(K key) {
	        int hashCode = Math.abs(key.hashCode());
	        int index = hashCode % Bucket;
	        return index;
	
	    }
	
	    // Print the linked list
	    @Override
	    public String toString() {
	        return "MyLinkedListNodes{" + head + "} ";
	    }
	}