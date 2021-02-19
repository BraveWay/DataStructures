package com.braveway.recursion;

public class Queen8 {
	static int max = 8;
	static int[] array = new int[max];
	static int count = 0;
	
	public static void main(String[] args) {
		 check(0);
		 System.out.println("死亡八皇后共有"+count+"种解法");
	}
	
	public static void check(int n) {
		if(n == 8) {
			count++;
			print();
			return ;
		}else {
			for(int i=0;i<max;i++) {
				array[n] = i;
				if(judge(n)) {
					check(n+1);
				}
			}
		}
	}
	
	/**
	 * 判断第n个皇后所在的位置是否与
	 * 前面所有的皇后在同一列，或者斜线上
	 * @param n
	 * @return
	 */
	public static boolean judge(int n) {
		for(int i=0;i<n;i++) {
			/**
			 * array[i] == array[n] 表示同一列
			 * Math.abs(n-i) == Math.abs(array[n]-array[i]) 行值等于列值，即同一条斜线上
			 */
			if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void print() {
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
