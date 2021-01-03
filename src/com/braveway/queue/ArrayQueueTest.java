package com.braveway.queue;

import java.util.Scanner;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);
		char key; // 控制台接受用户输入
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		// 输出一个菜单
		while (loop) {
			System.out.println("s(show):显示队列");
			System.out.println("e(exit):退出程序");
			System.out.println("a(add):添加数据到队列");
			System.out.println("r(remove):从队列取出数据");
			System.out.println("p(peek):显示头部元素");
			key = scanner.next().charAt(0);// 接收一个字符
			switch (key) {
			case 's':
				queue.show();
				break;
			case 'a':
				System.out.println("输入一个数");
				int value = scanner.nextInt();
				queue.add(value);
				break;
			case 'r':
				int res = queue.remove();
				System.out.printf("取出的数据是%d\n", res);
				break;
			case 'p':
				int res2 = queue.element();
				System.out.printf("队列的头部元素是%d\n", res2);
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

	int maxSize = 0; // 队列的最大容量
	int front = -1; // 队列的头指针，队列第一个元素所在位置的前一位
	int rear = -1; // 队列的尾指针，队列最后一个元素所在的位置
	final Object[] items;

	public ArrayQueue(int maxSize) {
		super();
		this.maxSize = maxSize;
		items = new Object[maxSize];
	}

	@Override
	public boolean add(E e) {
		if (this.isFull()) {
			throw new RuntimeException("队列已满");
		}
		items[++rear] = e;
		return true;
	}


	@SuppressWarnings("unchecked")
	@Override
	public E remove() {
		if (this.isEmpty()) {
			throw new RuntimeException("队列为空");
		}
		return (E) items[++front];
	}


	@SuppressWarnings("unchecked")
	@Override
	public E element() {
		if (this.isEmpty()) {
			throw new RuntimeException("队列为空");
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