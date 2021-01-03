package com.braveway.queue;

import java.util.Scanner;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);
		char key; // ����̨�����û�����
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		// ���һ���˵�
		while (loop) {
			System.out.println("s(show):��ʾ����");
			System.out.println("e(exit):�˳�����");
			System.out.println("a(add):������ݵ�����");
			System.out.println("r(remove):�Ӷ���ȡ������");
			System.out.println("p(peek):��ʾͷ��Ԫ��");
			key = scanner.next().charAt(0);// ����һ���ַ�
			switch (key) {
			case 's':
				queue.show();
				break;
			case 'a':
				System.out.println("����һ����");
				int value = scanner.nextInt();
				queue.add(value);
				break;
			case 'r':
				int res = queue.remove();
				System.out.printf("ȡ����������%d\n", res);
				break;
			case 'p':
				int res2 = queue.element();
				System.out.printf("���е�ͷ��Ԫ����%d\n", res2);
				break;
			case 'e':
				scanner.close();
				loop = false;
				break;
			default:
				break;
			}
		}
	}
}

class ArrayQueue<E> implements Queue<E> {

	int maxSize = 0; // ���е��������
	int front = -1; // ���е�ͷָ�룬���е�һ��Ԫ������λ�õ�ǰһλ
	int rear = -1; // ���е�βָ�룬�������һ��Ԫ�����ڵ�λ��
	final Object[] items;

	public ArrayQueue(int maxSize) {
		super();
		this.maxSize = maxSize;
		items = new Object[maxSize];
	}

	@Override
	public boolean add(E e) {
		if (this.isFull()) {
			throw new RuntimeException("��������");
		}
		items[++rear] = e;
		return true;
	}


	@SuppressWarnings("unchecked")
	@Override
	public E remove() {
		if (this.isEmpty()) {
			throw new RuntimeException("����Ϊ��");
		}
		return (E) items[++front];
	}


	@SuppressWarnings("unchecked")
	@Override
	public E element() {
		if (this.isEmpty()) {
			throw new RuntimeException("����Ϊ��");
		}
		return (E) items[front+1];
	}

	public boolean isEmpty() {
		return this.front == this.rear;
	}

	public boolean isFull() {
		return this.rear == this.maxSize - 1;
	}

	@Override
	public void show() {
		for (int i = front + 1; i <= rear; i++) {
			System.out.printf("arr[%d]=%d\n", i, items[i]);
		}
	}

}