package com.demo.beans;

public class AdjescencyMatrix {
	private boolean[][] adjmat;
	private int vertices;
	public AdjescencyMatrix(int vertices) {
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
