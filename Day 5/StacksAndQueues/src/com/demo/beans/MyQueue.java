package com.demo.beans;

import java.util.Arrays;

public class MyQueue {
	private int[] queuearr;
	private int front;
	private int rear;
	private int size;
	public MyQueue() {
		size=10;
		queuearr=new int[size];
		front=0;  //always points to the first value in the queue
		rear=-1;  //rear always point to the last value in the queue 
	}
	public MyQueue(int s) {
		size=s;
		queuearr=new int[size];
		front=0;  //always points to the first value in the queue
		rear=-1;  //rear always point to the last value in the queue 
	}
	public boolean isFull() {
		/*if(rear==size-1) {
			return true;
		}
		else {
			return false;
		}*/
		return rear==size-1;
	}
	public boolean isEmpty() {
		/*if (front>rear) {
			return true;
		}
		else {
			return false;
	}*/
     return front>rear;
	}
	
	public void enqueue(int n) {
		if(isFull()) {
			System.out.println("queue is full, cannot add");
			
		}
		else {
			rear++;
			queuearr[rear]=n;
			System.out.println(n+" added in the queue");
			
		}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty, so cannot delete the number");
			return -1;
		}
		else {
			int n=queuearr[front];
			System.out.println("removed value from front end "+front+"---->"+n);
			front++;
			return n;
	}
	}
	public String toString() {
		return Arrays.toString(queuearr)+" front :"+front+" rear: "+rear;
	}
}
