package com.bl.BST;


	public class BST {
		BSTNode root ;
	   public BST() {
	        root = null;
	    }
	
	    // inserting node
	   public void insert(int key) {
	        root = insertRecursive(key, root);
	    }
	
	   public BSTNode insertRecursive(int key, BSTNode root) {
	        // if empty
	        if (root == null) {
	            root = new BSTNode(key);
	            return root;
	        }
	
	        // inserting in left node
	        if (key < root.key) {
	            root.left = insertRecursive(key, root.left);
	        }
	        // inserting in right node
	        else if (key > root.key) {
	            root.right = insertRecursive(key, root.right);
	        }
	        return root;
	
	    }
	
	    // displaying in inorder
	    public void inorder() {
	        inorderRecursive(root);
	    }
	
	    public void inorderRecursive(BSTNode root) {
	        if (root != null) {
	            inorderRecursive(root.left);
	            System.out.print(root.key + " ");
	            inorderRecursive(root.right);
	        }
	    }
	}