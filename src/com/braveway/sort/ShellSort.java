package com.braveway.sort;

import java.util.Arrays;

/**
 * ϣ������
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

	// �Ƶ�����
	public static void test1(int[] array) {
		int temp = 0;
		// ϣ������ĵ�1������
		// ��Ϊ��1�������ǽ�10�����ݷֳ���5��
		for (int i = 5; i < array.length; i++) {
			// �������������е�Ԫ�أ���5�飬ÿ����2��Ԫ�أ�������5
			for (int j = i - 5; j >= 0; j -= 5) {
				// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵����Ҫ����
				if (array[j] > array[j + 5]) {
					temp = array[j];
					array[j] = array[j + 5];
					array[j + 5] = temp;
				}
			}
		}
		System.out.println("ϣ������1�ֺ�=" + Arrays.toString(array));

		// ϣ������ĵ�2������
		// ��Ϊ��2�������ǽ�10�����ݷֳ���5/2=2��
		for (int i = 2; i < array.length; i++) {
			// �������������е�Ԫ��(��2�飬ÿ����5��Ԫ��)������2
			for (int j = i - 2; j >= 0; j -= 2) {
				// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵����Ҫ���н���
				if (array[j] > array[j + 2]) {
					temp = array[j];
					array[j] = array[j + 2];
					array[j + 2] = temp;
				}
			}
		}
		System.out.println("ϣ������2�ֺ�=" + Arrays.toString(array));

		// ��Ϊ��3�������ǽ�10�����ݷֳ���2/2=1��
		for (int i = 1; i < array.length; i++) {
			// ���������е�����Ԫ�أ���1�飬ÿ��10��Ԫ�أ�������5
			for (int j = i - 1; j >= 0; j -= 1) {
				// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵����Ҫ���н���
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("ϣ������3�ֺ�=" + Arrays.toString(array));

	}

	public static void sort1(int[] array) {
		int temp = 0;
		int count = 0;
		// gap��ʾ�����������𽥼���
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				// �������������е�Ԫ�أ���gap�飬ÿ����length/gap��Ԫ�أ�������gap
				for (int j = i - gap; j >= 0; j -= gap) {
					// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵������
					if (array[j] > array[j + gap]) {
						temp = array[j];
						array[j] = array[j + gap];
						array[j + gap] = temp;
					}
				}
			}
			System.out.println("ϣ������" + (++count) + "�ֺ�=" + Arrays.toString(array));
		}
	}

	public static void sort(int[] array) {
		int temp = 0;
		// gap��ʾ�����������𽥼���
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				// �������������е�Ԫ�أ���gap�飬ÿ����length/gap��Ԫ�أ�������gap
				for (int j = i - gap; j >= 0; j -= gap) {
					// �����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ�˵������
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
		System.out.println("���򹲻�ʱ�䣺" + (end - start) + "����");
	}

	public static void print(int[] array) {
        System.out.println( Arrays.toString(array));
	}
}
