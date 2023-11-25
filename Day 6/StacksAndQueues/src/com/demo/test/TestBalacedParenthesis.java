package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyStringStack;

public class TestBalacedParenthesis {

	public static void main(String[] args) {
		MyStringStack ob=new MyStringStack(20);
		Scanner sc=new Scanner(System.in);
				
		//System.out.println("enetr string with parenthesis");
		//String str=sc.next();
		String str="({[][]()({})})";
	    boolean status=checkBalanceParenthesis(str);
	    if(status) {
	    	System.out.println("string is balanced");
	    }
	    else {
	    	System.out.println("string is not balanced");
	    }

	}

	private static boolean checkBalanceParenthesis(String str) {
		MyStringStack ob=new MyStringStack(str.length());
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				ob.push(ch);
			}else {
				if(ch==')' || ch=='}' || ch==']' ) {
					if(!ob.isEmpty()) {
					     char ch1=ob.pop();
					     if((ch==')' && ch1!='(') || (ch==']' && ch1!='[') 
					     || (ch=='}' && ch1!='{')) {
					    	 return false;
					     }
					}
					else {
						return false;
					}
					
					
				}
			}
		}
		if(ob.isEmpty())
			return true;
		else
			return false;
		
	}

}
