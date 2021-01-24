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
	
	 //������
	public Graph(int n) {
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
	}
	
	/**
	 * �õ�k���ĵ�һ���ڽӽ��
	 * @param k ���k
	 * @return
	 */
	public int getFirstNeighbour(int k) {
		
	}
	
	public int getNextNeighbour() {
		
	}
	
	public int get() {
		
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
