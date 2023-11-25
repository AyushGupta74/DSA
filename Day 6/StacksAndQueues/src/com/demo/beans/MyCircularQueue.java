package com.demo.beans;

import java.util.Arrays;

public class MyCircularQueue {
	private int[] queuearr;
	private int front;
	private int rear;
	private int size;
	public MyCircularQueue() {
		size=10;
		queuearr=new int[size];
		front=-1;  //always points to the first value in the queue
		rear=-1;  //rear always point to the last value in the queue 
	}
	public MyCircularQueue(int s) {
		size=s;
		queuearr=new int[size];
		front=0;  //always points to the first value in the queue
		rear=-1;  //rear always point to the last value in the queue 
	}
	public boolean isFull() {
		if(front==0 && rear==size-1)
			  return true;
		else if((rear+1)%size==front) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(front==-1) //&& (front==rear)
			 return true;
		return false;
	}
	
	public void enqueue(int n) {
		if(isFull()) {
			System.out.println("queue is full, cannot add");
			
		}
		else {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
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
			if(front==rear) {
				front=-1;
				rear=-1;
			}else {
				
			System.out.println("removed value from front end "+front+"---->"+n);
			front=(front+1)%size;
			return n;
	}
	}
	public String toString() {
		return Arrays.toString(queuearr)+" front :"+front+" rear: "+rear;
	}
}
