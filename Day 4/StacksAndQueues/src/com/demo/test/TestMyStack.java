package com.demo.test;

import com.demo.beans.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack ob=new MyStack(5);
		ob.push(12);
		ob.push(34);
		ob.push(55);
		ob.push(52);
		ob.push(53);
		ob.push(51);
		while(!ob.isEmpty())
		   System.out.println(ob.pop()); 

	}

}
