package com.demo.beans;

public class StackSingleList {
	
	private Node top;
	class Node{
		char num;
		Node next;
		public Node(char n) {
			super();
			num=n;
			next=null;
		}
		
	}
	public StackSingleList() {
		super();
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	public void push(char n) {
		Node newnode=new Node(n);
		if(top!=null) {
			newnode.next=top;
		}
		top=newnode;
		
	}
	public char pop() {
		if(top==null) {
			System.out.println("stack is empty,underflow");
		}
		Node temp=top;
		top=top.next;
		//it will make it ready for garbage collection
		temp.next=null;
		return temp.num;
		
		
	}

}
