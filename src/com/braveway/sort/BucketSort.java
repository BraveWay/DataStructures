package com.braveway.sort;

import java.util.Arrays;

/**
 * Ͱ����
 * @author YEJUN
 *
 */
public class BucketSort {

	public static void main(String[] args) {
		int[] array = {3,1,43,63,721,83};
		sort(array);
         print(array);
         test();
	}
	
	public static void test() {
		int[] array = new int[8000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10000000);
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		//print(array);
		System.out.println("���򹲻�ʱ�䣺" + (end - start)+ "����");
	}
	
	public static void sort(int[] array) {
		//���ֵ
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] > max ) {
				max = array[i];
			}
		}
		//���λ��
		int maxLen = Integer.toString(max).length();
		
		//ʮ��Ͱ��ÿ��Ͱ����ܷ���������
		int[][] s = new int[10][array.length];
		
		//��¼ÿ��Ͱ���˶�������
		int[] k = new int[10];
		
		for(int m=0;m<maxLen;m++) {
			for(int i=0;i<array.length;i++) {
				int mod  = array[i] /  (int)(Math.pow(10D, Double.valueOf(m+"")) ) % 10 ;//��ȡ��λ��
				s[mod][k[mod]] = array[i];
				k[mod] = k[mod]+1;
			}
			int index= 0;
			for(int i=0;i<10;i++) {
				if(k[i] > 0) {
					for(int j=0;j<k[i];j++) {
						array[index++] =  s[i][j];
					}
				}
			}
			k = new int[10];
		}
	}
	
	public static void print(int[] array) {
	  System.out.println(Arrays.toString(array));	
	}
}
