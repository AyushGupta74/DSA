package com.demo.beans;

public class SingleLinkedList {
	private Node head;
    class Node{
    	int n;
    	Node next;
    	Node(int d){
    		n=d;
    		next=null;
    	}
    	
    }
    public SingleLinkedList() {
    	head=null;
    }
    
        
    public void addatstart(int value) {
    	//create a node
    	Node newnode=new Node(value);
    	if(head==null) {
    		head=newnode;
    	}
    	else {
    			newnode.next=head;
    			head=newnode;
    	}	
    	
    }
        
    public boolean search(int n) {
    	Node temp=head;
    	while(temp!=null) {
    		
    		if(n==temp.n)
    			return true;
    		temp=temp.next;
    	}
    	return false;
    }
    public void removeByKey(int key) {
    	//remove the node with value key
    }
    
    public void displaydata() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.print(temp.n+",");
    		temp=temp.next;
    	}
    	System.out.println();
    }
}
