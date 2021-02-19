package com.braveway.sort;

import java.util.Arrays;

/**
 *    ��������
 * @author Brave Way
 *
 */
public class RadixSort {
	
	public static void main(String[] args) {
//		int[] array = { 90, 2, 78,78, 50, 1 };
//		sort(array);
//		print(array);
		test();
	}
	
	
	/**
	 * ���ܲ���
	 */
	public static void test() {
		int[] array = new int[80000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000000);
//			array[i] = i;
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		System.out.println("���򹲻�ʱ�䣺" + (end - start)+ "����");
//		print(array);
	}
	
	public static void sort(int[] array) {
		int temp = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] > temp ) {
				temp = array[i]; 
			}
		}
		int[] tempArray = new int[temp+1];
		
		for(int i=0;i<array.length;i++) {
			tempArray[array[i]] ++;
		}
		
		int tempIndex = 0;
		for(int i=0;i<tempArray.length;i++) {
			for(int j=1;j<=tempArray[i];j++) {
				array[tempIndex++] = i;
			}
		}
	}
	
	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	};
}
