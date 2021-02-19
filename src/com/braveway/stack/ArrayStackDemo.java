package com.braveway.stack;

import java.util.Scanner;


public class ArrayStackDemo {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>(5);
		char key; // ����̨�����û�����
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		// ���һ���˵�
		while (loop) {
			System.out.println("s(show):��ʾ����");
			System.out.println("a(push):������ݵ�ջ");
			System.out.println("r(pop):��ջ");
			System.out.println("p(peek):��ʾͷ��Ԫ��");
			System.out.println("e(exit):�˳�����");
			key = scanner.next().charAt(0);// ����һ���ַ�
			switch (key) {
			case 's':
				stack.show();
				break;
			case 'a':
				System.out.println("����һ����");
				int value = scanner.nextInt();
				stack.push(value);
				break;
			case 'r':
				int res = stack.pop();
				System.out.printf("ȡ����������%d\n", res);
				break;
			case 'p':
				int res2 = stack.peek();
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
			System.out.println("ջ����");
		}
		items[size++] = e;
	}
	
	public E pop() {
		if(isEmpty()) {
			throw new RuntimeException("ջΪ��");
		}
		return (E) items[--size];
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new RuntimeException("ջΪ��");
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
