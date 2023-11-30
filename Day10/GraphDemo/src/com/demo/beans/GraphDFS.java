package com.demo.beans;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphDFS {
	private boolean[][] adjmat;
	private int vertices;
	public GraphDFS(int vertices) {
		super();
		this.vertices = vertices;
		adjmat=new boolean[vertices][vertices];
	}
	
	public void addEdge(int i,int j) {
		//if undirected graph then add the following entry
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	public void removeEdge(int i,int j) {
		//if undirected graph then add the following entry
		adjmat[i][j]=false;
		adjmat[j][i]=false;
	}
	
	public void dfsTraversal(int n) {
		boolean[] visited=new boolean[vertices];
		Arrays.fill(visited, false);
		Stack<Integer> s=new Stack();
		s.push(n);
		visited[n]=true;
		System.out.println(n);
		while(!s.isEmpty()) {
			boolean flag=false;
			for(int i=0;i<adjmat[s.peek()].length;i++) {
				if(!visited[i] && adjmat[s.peek()][i]) {
					s.push(i);
					System.out.println(i);
					visited[i]=true;
					flag=true;
					break;
				}
			}
			if(!flag) {
				s.pop();
			}
			
		}
		
			
		
		
	}
	
	
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<adjmat.length;i++) {
			for(int j=0;j<adjmat[i].length;j++) {
				sb.append((adjmat[i][j]?1:0)+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
