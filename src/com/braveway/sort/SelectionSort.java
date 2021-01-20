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
	 * ѡ������ʵ��
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int temp = array[0]; //�����һ�������
			int tempIndex = 0;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j] > temp) { //�����������бȽϣ���¼��������
					temp = array[j];
					tempIndex = j;
				}
			}
			//ѭ���������ȡ�����������������±�
			//�������������һ�������н���
			array[tempIndex] = array[array.length-1-i];
			array[array.length-1-i] = temp; //���������������
		}
	}

	/**
	 * ���ܲ���
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
		System.out.println("���򹲻�ʱ�䣺" + (end - start)+ "����");
	}

	/** ���ݹ��̿�ʼ **/
	/** 90, 2, 78, 50, 1
	 * ���������ҳ���С����������������ʼ���߽�β��λ��
	 * @param array
	 */
	public static void sort1(int[] array) {
		int temp = array[0]; //�����һ�������
		int tempIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > temp) { //�����������бȽϣ���¼��������
				temp = array[i];
				tempIndex = i;
			}
		}
		//ѭ���������ȡ�����������������±�
		//�������������һ�������н���
		array[tempIndex] = array[array.length-1];
		array[array.length-1] = temp; //���������������
	}

	public static void sort2(int[] array) {
		int temp = array[0]; //�����һ�������
		int tempIndex = 0;
		for (int i = 1; i < array.length-1; i++) {
			if (array[i] > temp) { //�����������бȽϣ���¼��������
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-1];
		array[array.length-1-1] = temp; //���������������
	}

	public static void sort3(int[] array) {
		int temp = array[0]; //�����һ�������
		int tempIndex = 0;
		for (int i = 1; i < array.length-2; i++) {
			if (array[i] > temp) { //�����������бȽϣ���¼��������
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-2];
		array[array.length-1-2] = temp; //���������������
	}

	public static void sort4(int[] array) {
		int temp = array[0]; //�����һ�������
		int tempIndex = 0;
		for (int i = 1; i < array.length-3; i++) {
			if (array[i] > temp) { //�����������бȽϣ���¼��������
				temp = array[i];
				tempIndex = i;
			}
		}
		array[tempIndex] = array[array.length-1-3];
		array[array.length-1-3] = temp; //���������������
	}

	/** ���ݹ��̽��� **/

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
