package com.braveway.sort;

import java.util.Arrays;

/**
 * 桶排序
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
		System.out.println("排序共花时间：" + (end - start)+ "毫秒");
	}
	
	public static void sort(int[] array) {
		//最大值
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] > max ) {
				max = array[i];
			}
		}
		//最大位数
		int maxLen = Integer.toString(max).length();
		
		//十个桶，每个桶最多能放排序数组
		int[][] s = new int[10][array.length];
		
		//记录每个桶放了多少数据
		int[] k = new int[10];
		
		for(int m=0;m<maxLen;m++) {
			for(int i=0;i<array.length;i++) {
				int mod  = array[i] /  (int)(Math.pow(10D, Double.valueOf(m+"")) ) % 10 ;//获取个位数
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
