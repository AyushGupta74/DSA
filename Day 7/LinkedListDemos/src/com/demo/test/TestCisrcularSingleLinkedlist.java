package com.demo.test;

import com.demo.beans.CircularLinkedList;

public class TestCisrcularSingleLinkedlist {

	public static void main(String[] args) {
	  CircularLinkedList ob=new CircularLinkedList();
	  ob.addnodeByPosition(1, 12);
	  ob.addnodeByPosition(2, 13);
	  ob.addnodeByPosition(2, 15);
	  ob.addnodeByPosition(5, 100);
	  ob.displaydata();
	  //ob.deleteByKey(12);
	  //ob.deleteByKey(15);
	  //ob.displaydata();
	}

}
