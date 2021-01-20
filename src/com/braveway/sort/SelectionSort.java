package com.braveway.sort;

/**
 * 
 * @author Brave Way
 *
 */
public class SelectionSort {

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
	 * 选择排序实现
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int temp = array[0]; //假设第一个数最大
			int tempIndex = 0;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j] > temp) { //与其他数进行比较，记录下最大的数
					temp = array[j];
					tempIndex = j;
				}
			}
			//循环结束后获取到数组中最大的数和下标
			//将最大的数和最后一个数进行交换
			array[tempIndex] = array[array.length-1-i];
			array[array.length-1-i] = temp; //将最大的数放在最后
		}
	}

	/**
	 * 性能测试
	 */
	public static void test() {
		int[] array = new int[800000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000000);
//			array[i] = i;
		}
		long start = System.currentTimeMillis();
		sort(array);
		long end = System.currentTimeMillis();
		System.out.println("排序共花时间：" + (end - start)+ "毫秒");
	}

	/** 推演过程开始 **/
	/** 90, 2, 78, 50, 1
	 * 从数组中找出最小或者最大的数放在起始或者结尾的位置
	 * @param array
	 */
	public static void sort1(int[] array) {
		int temp = array[0]; //假设第一个数最大
		int tempIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > temp) { //与其他数进行比较，记录下最大的数
				temp = array[i];
				tempIndex = i;
			}
		}
		//循环结束后获取到数组中最大的数和下标
		//将最大的数和最后一个数进行交换
		array[tempIndex] = array[array.length-1];
		array[array.length-1] = temp; //将最大的数放在最后
	}

	public static void sort2(int[] array) {
		int temp = array[0]; //假设第一个数最大
		int tempIndex = 0;
		for (int i = 1; i < array.length-1; i++) {
			if (array[i] > temp) { //与其他数进行比较，记录下最大的数
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-1];
		array[array.length-1-1] = temp; //将最大的数放在最后
	}

	public static void sort3(int[] array) {
		int temp = array[0]; //假设第一个数最大
		int tempIndex = 0;
		for (int i = 1; i < array.length-2; i++) {
			if (array[i] > temp) { //与其他数进行比较，记录下最大的数
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-2];
		array[array.length-1-2] = temp; //将最大的数放在最后
	}

	public static void sort4(int[] array) {
		int temp = array[0]; //假设第一个数最大
		int tempIndex = 0;
		for (int i = 1; i < array.length-3; i++) {
			if (array[i] > temp) { //与其他数进行比较，记录下最大的数
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-3];
		array[array.length-1-3] = temp; //将最大的数放在最后
	}

	/** 推演过程结束 **/

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
