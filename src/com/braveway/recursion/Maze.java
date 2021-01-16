package com.braveway.recursion;

public class Maze {
	static int[][] maze = new int[8][7];
	public static void main(String[] args) {
		print();
		init();
		System.out.println("================");
		print();
		setWay(1,1);
		System.out.println("================");
		print();
	}
	
	/**
	 * 
	 * @param i
	 * @param j
	 */
	public static boolean setWay(int i,int j) {
		if(maze[6][5] == 2) {
			return true;
		}else {
			if(maze[i][j] == 0) { //未走过
				maze[i][j] = 2 ; //2表示假定该路为通路
				if(setWay(i,j+1)) { //往下走
					return true;
				}else if(setWay(i+1,j)){ //往右走
					return true;
				}else if(setWay(i-1,j)) { //往左走
					return true;
				}else if(setWay(i,j-1)) { //往上走
					return true;
				}else {
					maze[i][j] = 3;
					return false;
				}
			}else { //maze[i][j] = 1 ,2,3
				return false;
			}
		}
		
	}
	
	public static void init() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<7;j++) {
				if(i ==0 || i==7 || j==0||j==6) {
					maze[i][j] = 1;
				}
			}
		}
//		maze[3][1] = 1;
//		maze[3][2] = 1;
		
		maze[1][2] = 1;
		maze[2][2] = 1;
	}
	
	public static void print() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}
}
