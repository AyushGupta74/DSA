package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
	    SingleLinkedList ob=new SingleLinkedList();
	    ob.addAtEnd(10);
	    ob.addAtEnd(11);
	    ob.addByPosition(12, 1);
	    ob.addByPosition(13, 3);
	    ob.addByPosition(22, 3);
	    ob.addByPosition(100, 4);
	    ob.displaydata();
	}
}
