package com.demo.test;

import com.demo.beans.MyQueue;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue ob=new MyQueue(5);
		ob.enqueue(10);
		ob.enqueue(11);
		ob.enqueue(12);
		ob.enqueue(13);
		ob.enqueue(14);
		System.out.println(ob);
		ob.enqueue(15);
		ob.dequeue();
		System.out.println(ob);
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		System.out.println(ob);
		ob.dequeue();
	}

}
