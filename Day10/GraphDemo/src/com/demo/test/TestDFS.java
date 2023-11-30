package com.demo.test;

import com.demo.beans.GraphBFS;
import com.demo.beans.GraphDFS;

public class TestDFS {

	public static void main(String[] args) {
		GraphDFS ob=new GraphDFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(0,2);
		ob.addEdge(1, 3);
		ob.addEdge(2,3);
		ob.addEdge(2, 4);
		System.out.println(ob);
        ob.dfsTraversal(0);

	}

}
