package com.demo.test;

import com.demo.beans.AdjescencyList;

public class TestAdjescencyList {

	public static void main(String[] args) {
		AdjescencyList ob=new AdjescencyList(5);
		ob.addEdge(0, 1);
		ob.addEdge(0,2);
		ob.addEdge(1, 3);
		ob.addEdge(2,3);
		ob.addEdge(2, 4);
		ob.displayGrpah();
        //ob.bfsTraversal();
	}

}
