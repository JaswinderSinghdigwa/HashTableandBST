package com.bl.BST;

/**
 * Purpose  - To create Binary Search Tree
 * @author  - Jaswindersingh
 * @version - 16.0
 * @since   - 30-09-2021
 */

public class BSTmain {
    public static void main(String[] args) {
        BST bst = new BST();

		//inserting 1st uc
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        //for uc2
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(16);
        bst.insert(3);
        bst.insert(70);
        bst.insert(95);
        bst.insert(60);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);

        //displaying
        System.out.println("Data in the format of left-root-right");
        bst.inorder();
    }
}