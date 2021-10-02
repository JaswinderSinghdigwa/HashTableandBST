package com.bl.BST;

/**
 * Purpose  - To create Binary Search Tree
 * @author  - Jaswindersingh
 * @version - 16.0
 * @since   - 31-09-2021
 */

public class BSTmain {
    public static void main(String[] args) {
        BST bst = new BST();

        //inserting 1st uc
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        //displaying
        System.out.println("Data in the format of left-root-right");
        bst.inorder();
    }
}