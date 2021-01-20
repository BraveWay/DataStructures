package com.braveway.sort;

import java.util.Arrays;

/**
 * ��������һ��Ҳ����Ϊֱ�Ӳ������򡣶�������Ԫ�ص���������һ����Ч���㷨 
 * @author Brave Way
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {5,6,0,3,2,1};
//		sort1(array);
//		print(array);
//		sort2(array);
//		sort3(array);
//		sort4(array);
//		sort5(array);
//		sort(array);
//		print(array);
		test();
		System.out.println();
	}
	
	public static void sort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int index=i;
			int val = array[index];
			while(index > 0 && val < array[index-1]) {
			   array[index] = array[index-1];
			   array[index-1] = val;
			   index--;
			}	
		}
	}
	
	/**
	 * ���ܲ���
	 */
	public static void test() {
		int[] array = new int[800000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000000);
//			array[i] = (int) (Math.random() * 100);
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		System.out.println("���򹲻�ʱ�䣺" + (end - start)+ "����");
	}
	
	/**���ݹ���**/
	public static void sort1(int[] array) {
		int index=1;
		int val = array[index];
		while(index > 0 && val < array[index-1]) {
		   array[index] = array[index-1];
		   array[index-1] = val;
		   index--;
		}
	}
	
	public static void sort2(int[] array) {
		int index=2;
		int val = array[index];
		while(index > 0 && val < array[index-1]) {
		   array[index] = array[index-1];
		   array[index-1] = val;
		   index--;
		}
	}
	
	public static void sort3(int[] array) {
		int index=3;
		int val = array[index];
		while(index > 0 && val < array[index-1]) {
		   array[index] = array[index-1];
		   array[index-1] = val;
		   index--;
		}
	}
	
	public static void sort4(int[] array) {
		int index=4;
		int val = array[index];
		while(index > 0 && val < array[index-1]) {
		   array[index] = array[index-1];
		   array[index-1] = val;
		   index--;
		}
	}
	
	public static void sort5(int[] array) {
		int index=5;
		int val = array[index];
		while(index > 0 && val < array[index-1]) {
		   array[index] = array[index-1];
		   array[index-1] = val;
		   index--;
		}
	}
	
	/**���ݹ���**/
	
	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
