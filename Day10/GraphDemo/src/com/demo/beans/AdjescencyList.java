package com.demo.beans;

public class AdjescencyList {
	private int vertices;
	SingleLinkedList[] graph;
	public AdjescencyList(int vertices) {
		super();
		this.vertices = vertices;
		graph=new SingleLinkedList[vertices];
		for(int i=0;i<graph.length;i++) {
			graph[i]=new SingleLinkedList();
		}
	}
	
	public void addEdge(int i,int j) {
		//if the graph is undirected
		graph[i].addatstart(j);
		graph[j].addatstart(i);
	}
	
	public void removeEdge(int i,int j) {
		//graph[i].removeByKey(j);
		//graph[j].removeByKey(i);
	}
	
	public void displayGrpah() {
		for(int i=0;i<graph.length;i++) {
			System.out.print(i+"--->");
			graph[i].displaydata();
		}
		
		
		
	}
	
	

}
