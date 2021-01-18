package com.braveway.stack;

import java.util.Scanner;


public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>(5);
		char key; // 控制台接受用户输入
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		// 输出一个菜单
		while (loop) {
			System.out.println("s(show):显示队列");
			System.out.println("a(push):添加数据到栈");
			System.out.println("r(pop):出栈");
			System.out.println("p(peek):显示头部元素");
			System.out.println("e(exit):退出程序");
			key = scanner.next().charAt(0);// 接收一个字符
			switch (key) {
			case 's':
				stack.show();
				break;
			case 'a':
				System.out.println("输入一个数");
				int value = scanner.nextInt();
				stack.push(value);
				break;
			case 'r':
				int res = stack.pop();
				System.out.printf("取出的数据是%d\n", res);
				break;
			case 'p':
				int res2 = stack.peek();
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

class ArrayStack<E>{
	int size = 0;
	final Object[] items;
	int maxSize = 0;
	
	public ArrayStack(int maxSize) {
		super();
		this.maxSize = maxSize;
		items = new Object[maxSize];
	}
	
	public void push(E e) {
		if(isFull()) {
			System.out.println("栈已满");
		}
		items[size++] = e;
	}
	
	public E pop() {
		if(isEmpty()) {
			throw new RuntimeException("栈为空");
		}
		return (E) items[--size];
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new RuntimeException("栈为空");
		}
		return (E) items[size-1];
	}
	
	public void show() {
		for(int i=size-1;i>=0;i--) {
			System.out.printf("stack[%d]=%d\n",i,items[i]);
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
}
