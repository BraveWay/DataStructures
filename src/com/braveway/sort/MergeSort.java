package com.braveway.sort;

import java.util.Arrays;

/**
 *    �鲢����
 * @author Brave Way
 *
 */
public class MergeSort {

	public static void main(String[] args) {
//		int[] array = {0,5,6,7,8,9,1,2,3,4,99};
//		int[] tempArray = new int[array.length];
//		merge(array,0,5,array.length-1,tempArray);
//		sort(array,0,array.length-1,tempArray);
//		System.out.println(Arrays.toString(array));
		test();
	}
	
    public static void sort(int[] array,int l ,int r,int[] tempArray) {
    	if(l < r) {
    		int mid = (l+r)/2;
    		sort(array,l,mid,tempArray);
    		sort(array,mid+1,r,tempArray);
    		merge(array,l,mid,r,tempArray);
    	}
	}
    
    /**
	 * ���ܲ���
	 */
	public static void test() {
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		int[] tempArray = new int[array.length];
		long start = System.currentTimeMillis();
		sort(array,0,array.length-1,tempArray);
		long end = System.currentTimeMillis();
		System.out.println("���򹲻�ʱ�䣺" + (end - start)+ "����");
//		print(array);
	}
	
	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	};

    /**
     * 
     * @param array ����������
     * @param left ����������������±�
     * @param mid   
     * @param right �������������Ҷ��±�
     * @param tempArray ��ʱ����
     */
	public static void merge(int[] array,int left,int mid,int right,int[] tempArray) {
		int l = left;
		int r = mid+1;
		int t=0;//tempArray������ݵ�����
		while(l <=mid && r <=right   ) {
			if(array[l] <= array[r]) {
				tempArray[t] = array[l];
				t = t+1;
				l = l+1;
			}else {
				tempArray[t] = array[r];
				t = t+1;
				r = r+1;
			}
		}
		
		while(l <=mid) {
			tempArray[t] =  array[l];
			t = t+1;
			l = l+1;
		}
		
		while(r <=right ) {
			tempArray[t] =  array[r];
			t = t+1;
			r = r+1;
		}
		
		int k = 0;
		for(int i = left;i<=right;i++) {
			array[i]=tempArray[k];
			k++;
		}
	}
}
