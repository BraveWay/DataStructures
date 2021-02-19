package com.braveway.sort;

import java.util.Arrays;

/**
 * ��������
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
	 * ���ܲ���
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
		System.out.println("���򹲻�ʱ�䣺" + (end - start) + "����");
//		print(array);
	}

	public static void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int l, int r) {
		int start = l;
		int end = r;
		int pivot = (l + r) / 2; // ȷ��һ����׼ֵ
		int temp = array[pivot];
		int tempVal = 0;

		while (l < r) {
			// �������һ���Ȼ�׼ֵ�����
			while (l < r && array[l] < temp) {
				l++;
			}
			// ���ұ���һ���Ȼ�׼ֵС����
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
