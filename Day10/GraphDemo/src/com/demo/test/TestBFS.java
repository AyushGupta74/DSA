package com.demo.test;

import com.demo.beans.AdjescencyList;
import com.demo.beans.GraphBFS;

public class TestBFS {

	public static void main(String[] args) {
		GraphBFS ob=new GraphBFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(0,2);
		ob.addEdge(1, 3);
		ob.addEdge(2,3);
		ob.addEdge(2, 4);
		System.out.println(ob);
        ob.bfsTraversal(0);

	}

}
