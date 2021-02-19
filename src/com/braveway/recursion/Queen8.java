package com.braveway.recursion;

public class Queen8 {
	static int max = 8;
	static int[] array = new int[max];
	static int count = 0;
	
	public static void main(String[] args) {
		 check(0);
		 System.out.println("�����˻ʺ���"+count+"�ֽⷨ");
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
	 * �жϵ�n���ʺ����ڵ�λ���Ƿ���
	 * ǰ�����еĻʺ���ͬһ�У�����б����
	 * @param n
	 * @return
	 */
	public static boolean judge(int n) {
		for(int i=0;i<n;i++) {
			/**
			 * array[i] == array[n] ��ʾͬһ��
			 * Math.abs(n-i) == Math.abs(array[n]-array[i]) ��ֵ������ֵ����ͬһ��б����
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
