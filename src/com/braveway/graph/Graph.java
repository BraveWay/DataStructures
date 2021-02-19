package com.braveway.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

	public static void main(String[] args) {
		int n = 5; //结点的个数
		String[] vertexValue = {"A","B","C","D","E"};
		//创建图对象
		Graph graph = new Graph(5);
		//循环的添加定点
		for(String vertex : vertexValue ) {
			graph.insertVertex(vertex);
		}
		//添加边
		//A-B A-C B-C B-D B-E
		graph.insertEdge(0, 1, 1);
		graph.insertEdge(0, 2, 1);
		graph.insertEdge(1, 2, 1);
		graph.insertEdge(1, 3, 1);
		graph.insertEdge(1, 4, 1);
		
		graph.showGraph();
	}
	
	 ArrayList<String> vertexList; //存储顶点集合 
	 int[][] edges;  //存储图对应的邻结矩阵
	 int numOfEdges; //表示边的数目
	 boolean[] isVisited;
	
	 //构造器
	public Graph(int n) {
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
		isVisited = new boolean[5];
	}
	
	public void dfs() {
		for(int i=0;i<vertexList.size();i++) {
			int m = getFirstNeighbour(i);
		}
	}
	
	/**
	 *  根据当前结点的下标获取第一个邻接结点的下标
	 * @param k 结点k
	 * @return
	 */
	public int getFirstNeighbour(int k) {
		return -1;
	}
	
	/**
	 *  根据当前节点的前一个邻接结点的下标获取下一个邻接节点的下标
	 * @param v
	 * @param w
	 * @return
	 */
	public int getNextNeighbour(int v,int w) {
		return -1;
	}
	
	public int get() {
		return -1;
	}
	
	//常用的方法
	//返回结点个数
	public int getNumOfVertex() {
		return vertexList.size();
	}
	
	//得到边的数目
	public int getNumOfEdges() {
		return numOfEdges;
	}
	
	//显示图对应的矩阵
	public void showGraph() {
		for(int i=0;i<edges.length;i++) {
			System.out.println(Arrays.toString(edges[i]));
		}
	}
	
	//返回结点i（下标）对应的数据
	public String getValueByIndex(int i) {
		return vertexList.get(i);
	}
	
	
	
	//插入节点
	public void insertVertex(String vertex) {
		vertexList.add(vertex);
	}
	
	/**
	 * 添加边
	 * @param v1
	 * @param v2
	 * @param weight
	 */
	public void insertEdge(int v1,int v2,int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges ++;
	}
	
}
