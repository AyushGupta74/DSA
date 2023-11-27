package com.demo.test;

import com.demo.beans.StackSingleList;

public class TestStackLinkedList {

	public static void main(String[] args) {
		String str="((({{}))";
		
		boolean flag=validateString(str);
		if(flag) {
			System.out.println("balanced paranthesis");
		}else{
			System.out.println("unbalanced paranthesis");
		}
		
		
		

	}

	private static boolean validateString(String str) {
		StackSingleList ob=new StackSingleList();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				ob.push(ch);
			}else {
				char ch1=ob.pop();
				if((ch==')' && ch1!='(') || (ch==']' && ch1!='[') || (ch=='}' && ch1!='{')){
					return false;
				}
				
			}
		}
		if(ob.isEmpty()) {
			return true;
		}
		return false;
	}

}
