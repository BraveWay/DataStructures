package com.braveway.queue;

import java.util.Scanner;

/**
 * 环形队列 解决数组队列中数组只能使用一次的问题（队列填满之后再移除元素却不能新增元素的问题）
 * 
 * @author Brave Way
 *
 */
public class CircleArrayQueueTest {

	public static void main(String[] args) {
		CircleArrayQueue<Integer> queue = new CircleArrayQueue<Integer>(5);
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

class CircleArrayQueue<E> implements Queue<E> {

	int front = 0; // 指向队列的第一个元素所在的位置
	int rear = 0; // 指向队列最后一个元素的后一个位置
	int maxSize;
	final Object[] items;
	int size = 0;

	public CircleArrayQueue(int maxSize) {
		super();
		this.maxSize = maxSize;
		items = new Object[maxSize];
	}

	@Override
	public boolean add(E e) {
		if(!this.isFull()) {
			items[rear] = e;
			//当rear+1 <  maxSize 时，则rear=rear+1
			//当rear+1 >= maxsize 时，则rear = rear+1-maxSize*m
			rear = (rear+1)%maxSize;
			size++;
			return true;	
		}
		throw new RuntimeException("队列已满");
	}

	@Override
	public E remove() {
		if(!this.isEmpty()) {
			E e =  (E) items[front];
			front = (front+1)%maxSize;
			size--;
			return e;
			
		}
		throw new RuntimeException("队列已为空");
	}

	@Override
	public E element() {
		if(!this.isEmpty()) {
			return (E) items[front];
		}
		throw new RuntimeException("队列已为空");
		
	}

	@Override
	public void show() {
		for(int i=front;i<front+size;i++) {
			System.out.printf("%d\t",items[i%maxSize]);
		}
		System.out.println();
	}
	
	@Override
	public boolean isEmpty() {
		return rear==front;
	}

	@Override
	public boolean isFull() {
		return (rear-front+1)%maxSize == 0;
	}
}
