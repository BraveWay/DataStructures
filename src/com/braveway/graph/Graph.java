package com.braveway.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

	public static void main(String[] args) {
		int n = 5; //���ĸ���
		String[] vertexValue = {"A","B","C","D","E"};
		//����ͼ����
		Graph graph = new Graph(5);
		//ѭ������Ӷ���
		for(String vertex : vertexValue ) {
			graph.insertVertex(vertex);
		}
		//��ӱ�
		//A-B A-C B-C B-D B-E
		graph.insertEdge(0, 1, 1);
		graph.insertEdge(0, 2, 1);
		graph.insertEdge(1, 2, 1);
		graph.insertEdge(1, 3, 1);
		graph.insertEdge(1, 4, 1);
		
		graph.showGraph();
	}
	
	 ArrayList<String> vertexList; //�洢���㼯�� 
	 int[][] edges;  //�洢ͼ��Ӧ���ڽ����
	 int numOfEdges; //��ʾ�ߵ���Ŀ
	 boolean[] isVisited;
	
	 //������
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
	 *  ���ݵ�ǰ�����±��ȡ��һ���ڽӽ����±�
	 * @param k ���k
	 * @return
	 */
	public int getFirstNeighbour(int k) {
		return -1;
	}
	
	/**
	 *  ���ݵ�ǰ�ڵ��ǰһ���ڽӽ����±��ȡ��һ���ڽӽڵ���±�
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
	
	//���õķ���
	//���ؽ�����
	public int getNumOfVertex() {
		return vertexList.size();
	}
	
	//�õ��ߵ���Ŀ
	public int getNumOfEdges() {
		return numOfEdges;
	}
	
	//��ʾͼ��Ӧ�ľ���
	public void showGraph() {
		for(int i=0;i<edges.length;i++) {
			System.out.println(Arrays.toString(edges[i]));
		}
	}
	
	//���ؽ��i���±꣩��Ӧ������
	public String getValueByIndex(int i) {
		return vertexList.get(i);
	}
	
	
	
	//����ڵ�
	public void insertVertex(String vertex) {
		vertexList.add(vertex);
	}
	
	/**
	 * ��ӱ�
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
