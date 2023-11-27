package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestHashing {

	public static void main(String[] args) {
		SingleLinkedList[] hashtab=new SingleLinkedList[5];
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i]=new SingleLinkedList();
		}
		int[] arr= {25,12,14,45,1,3,8,9};
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i]%hashtab.length;
			hashtab[pos].addatstart(arr[i]);
			
		}
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i].displaydata();
		}
		
		int searchnum=100;
		int pos=searchnum%hashtab.length;
		System.out.println("search num"+pos);
		if(hashtab[pos].search(searchnum)) {
			System.out.println("number exists"+searchnum);
		}else {
			System.out.println("number does not exists");
		}
		 

	}

}
