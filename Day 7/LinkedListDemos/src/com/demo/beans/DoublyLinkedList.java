package com.demo.beans;

public class DoublyLinkedList {
	Node head;
	class Node{
		int num;
		Node prev;
		Node next;
		public Node(int num) {
			super();
			this.num = num;
			prev=null;
			next=null;
		};
		
	}
	public DoublyLinkedList() {
		super();
		head=null;
	}
	public void addAtEnd(int n) {
		Node newnode=new Node(n);
		//if list is empty 
		if(head==null) {
			head=newnode;
		}
		//if list is not empty
		else {
			Node temp=head;
			//move temp to the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	
	public void addAtPosition(int val,int pos){
		Node newnode=new Node(val);
		if(pos==1) {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
		Node temp=head;
		//this will place temp to the node after which we want to add
		for(int i=1;temp!=null && i<=pos-2;i++) {
			temp=temp.next;
		}
		if(temp!=null) {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next.prev=newnode;
			temp.next=newnode;
			
		}
		else {
			System.out.println("wrong position");
		}
	}
	
	//public void addBeforeKey(int num)
	//public void addAfterKey(int num)
	
	public int deleteByKey(int num) {
		Node current=head;
		int n=-1;
		while(current!=null && current.num!=num) {
			current=current.next;
		}
		if(current!=null) {
			//delete the node from the begining
			if(current==head) {
				head=head.next;
				head.prev=null;
				current.next=null;
				n=current.num;
				current=null;
			}//delete from  in between
			else {
				current.prev.next=current.next;
				if(current.next!=null) {
				    current.next.prev=current.prev;
				    current.next=null;
				}
				current.prev=null;
				n=current.num;
				current=null;
				
			}
		}
		return n;
	}
	

}
