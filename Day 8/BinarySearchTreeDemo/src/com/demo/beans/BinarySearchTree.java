package com.demo.beans;

public class BinarySearchTree {
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	
	//insert key into tree
	public void insert(int key) {
		root=insertRec(root,key);
		
	}
	private Node insertRec(Node root,int key) {
		/*if the tree is empty, then return a new node*/
		if(root==null) {
			root=new Node(key);
			return root;
		}//add it in the left subtree
		if(key<root.data) {
			root.left=insertRec(root.left,key);
		}else {//add it in the right subtree
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	
	//inorder traversal
	public void inorder() {
		inorderTraversal(root);
	}
	
	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			inorderTraversal(root.right);
		}
		
	}
	
	//preorder traversal
		public void preorder() {
			preorderTraversal(root);
		}
		
		private void preorderTraversal(Node root) {
			if(root!=null) {
				System.out.print(root.data+",");
				preorderTraversal(root.left);
				preorderTraversal(root.right);
			}
			
		}
		//preorder traversal
		public void postorder() {
			postorderTraversal(root);
		}
				
		private void postorderTraversal(Node root) {
			if(root!=null) {
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+",");
			}
					
		}
		

}
