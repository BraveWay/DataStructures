package com.braveway.sort;

/**
 * 
 * @author Brave Way
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 90, 2, 78, 50, 1 };

//        sort(array);
//        print(array);
		  test();
//        
//        sort1(array);
//        print(array);
//        sort2(array);
//        print(array);
//        sort3(array);
//        print(array);
//        sort4(array);
//        print(array);
	}

	/**
	 * 冒泡排序实现
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 性能测试
	 */
	public static void test() {
		int[] array = new int[80000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000000);
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		System.out.println("排序共花时间：" + (end - start) / 1000 + "秒");
	}

	/** 推演过程开始 **/
	public static void sort1(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}

	public static void sort2(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1 - 1; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}

	public static void sort3(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1 - 2; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}

	public static void sort4(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length - 1 - 3; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}

	/** 推演过程结束 **/

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
