package com.demo.beans;

public class MyStringStack {
	private char[] arr;
	private int size;
	private int top;
	public MyStringStack() {
		arr=new char[10];
		size=10;
		top=-1;
	}
	public MyStringStack(int n) {
		arr=new char[n];
		size=n;
		top=-1;
	}
	public boolean isEmpty() {
		/*if(top==-1)
			return true;
		else
			return false;*/
		return top==-1;
	}
	public boolean isFull() {
		/*if(top==size-1) {
			return true;
		}
		else {
			return false;
		}*/
		return top==size-1;
	}
	public boolean push(char n) {
		if (isFull()) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			top++;
			arr[top]=n;
			return true;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return '#';
		}
		else {
			char ch=arr[top];
			top--;
			return ch;
			
		}
	}

}
