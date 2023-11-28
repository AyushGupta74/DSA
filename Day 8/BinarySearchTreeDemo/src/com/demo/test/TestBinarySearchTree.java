package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		/*       60
		 *      /   \
		 *     35    75
		 *    /  \   / \
		 *   20  40 70  85
		 * 
		 * 
		 */
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		bst.inorder();
		System.out.println();
		System.out.println("--------------------------------");
		bst.preorder();
		System.out.println();
		System.out.println("--------------------------------");
		bst.postorder();
	}

}
