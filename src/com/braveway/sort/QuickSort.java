package com.braveway.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 
 * @author Brave Way
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] array = { 3, 3, 3, 7, 9, 122344, 4656, 34, 34, 4656, 5, 6, 7, 8, 9, 343, 57765, 23, 12321 };
		// 0 - 10
		print(array);
		quickSort(array, 0, array.length - 1);
		print(array);
		test();
//		sort1(array,0,array.length-1);
//		print(array);
	}

	/**
	 * 性能测试
	 */
	public static void test() {
		int[] array = new int[80000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000000000);
//			array[i] = i;
		}
		long start = System.currentTimeMillis();
		quickSort(array, 0, array.length - 1);
		long end = System.currentTimeMillis();
		System.out.println("排序共花时间：" + (end - start) + "毫秒");
//		print(array);
	}

	public static void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int l, int r) {
		int start = l;
		int end = r;
		int pivot = (l + r) / 2; // 确定一个基准值
		int temp = array[pivot];
		int tempVal = 0;

		while (l < r) {
			// 从左边找一个比基准值大的数
			while (l < r && array[l] < temp) {
				l++;
			}
			// 从右边找一个比基准值小的数
			while (r > l && array[r] > temp) {
				r--;
			}
			if ((array[l] == array[r]) && (l < r)) {
				l++;
			} else {
				tempVal = array[r];
				array[r] = array[l];
				array[l] = tempVal;
			}
		}

		if (l - 1 > start) {
			quickSort(array, start, l - 1);
		}
		if (r + 1 < end) {
			quickSort(array, r + 1, end);
		}
	}

	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
