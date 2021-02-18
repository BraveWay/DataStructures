package com.braveway.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 
 * @author Brave Way
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
		// test1(arr);
		// sort(arr);
		test();
	}

	// 推导过程
	public static void test1(int[] array) {
		int temp = 0;
		// 希尔排序的第1轮排序
		// 因为第1轮排序，是将10个数据分成了5组
		for (int i = 5; i < array.length; i++) {
			// 遍历各组中所有的元素（共5组，每组有2个元素），步长5
			for (int j = i - 5; j >= 0; j -= 5) {
				// 如果当前元素大于加上步长后的那个元素，说明需要交换
				if (array[j] > array[j + 5]) {
					temp = array[j];
					array[j] = array[j + 5];
					array[j + 5] = temp;
				}
			}
		}
		System.out.println("希尔排序1轮后=" + Arrays.toString(array));

		// 希尔排序的第2轮排序
		// 因为第2轮排序，是将10个数据分成了5/2=2组
		for (int i = 2; i < array.length; i++) {
			// 遍历各组中所有的元素(共2组，每组有5个元素)，步长2
			for (int j = i - 2; j >= 0; j -= 2) {
				// 如果当前元素大于加上步长后的那个元素，说明需要进行交换
				if (array[j] > array[j + 2]) {
					temp = array[j];
					array[j] = array[j + 2];
					array[j + 2] = temp;
				}
			}
		}
		System.out.println("希尔排序2轮后=" + Arrays.toString(array));

		// 因为第3轮排序，是将10个数据分成了2/2=1组
		for (int i = 1; i < array.length; i++) {
			// 遍历各组中的所有元素（共1组，每组10个元素），步长5
			for (int j = i - 1; j >= 0; j -= 1) {
				// 如果当前元素大于加上步长后的那个元素，说明需要进行交换
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("希尔排序3轮后=" + Arrays.toString(array));

	}

	public static void sort1(int[] array) {
		int temp = 0;
		int count = 0;
		// gap表示步长，步长逐渐减少
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				// 遍历各组中所有的元素（共gap组，每组有length/gap个元素），步长gap
				for (int j = i - gap; j >= 0; j -= gap) {
					// 如果当前元素大于加上步长后的那个元素，说明交换
					if (array[j] > array[j + gap]) {
						temp = array[j];
						array[j] = array[j + gap];
						array[j + gap] = temp;
					}
				}
			}
			System.out.println("希尔排序" + (++count) + "轮后=" + Arrays.toString(array));
		}
	}

	public static void sort(int[] array) {
		int temp = 0;
		// gap表示步长，步长逐渐减少
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				// 遍历各组中所有的元素（共gap组，每组有length/gap个元素），步长gap
				for (int j = i - gap; j >= 0; j -= gap) {
					// 如果当前元素大于加上步长后的那个元素，说明交换
					if (array[j] > array[j + gap]) {
						temp = array[j];
						array[j] = array[j + gap];
						array[j + gap] = temp;
					}
				}
			}
		}
	}

	public static void test() {
		int[] array = new int[80];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		//print(array);
		System.out.println("排序共花时间：" + (end - start) + "毫秒");
	}

	public static void print(int[] array) {
        System.out.println( Arrays.toString(array));
	}
}
