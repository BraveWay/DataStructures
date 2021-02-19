package com.braveway.queue;

import java.util.Scanner;

/**
 * ���ζ��� ����������������ֻ��ʹ��һ�ε����⣨��������֮�����Ƴ�Ԫ��ȴ��������Ԫ�ص����⣩
 * 
 * @author Brave Way
 *
 */
public class CircleArrayQueueTest {

	public static void main(String[] args) {
		CircleArrayQueue<Integer> queue = new CircleArrayQueue<Integer>(5);
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

class CircleArrayQueue<E> implements Queue<E> {

	int front = 0; // ָ����еĵ�һ��Ԫ�����ڵ�λ��
	int rear = 0; // ָ��������һ��Ԫ�صĺ�һ��λ��
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
			//��rear+1 <  maxSize ʱ����rear=rear+1
			//��rear+1 >= maxsize ʱ����rear = rear+1-maxSize*m
			rear = (rear+1)%maxSize;
			size++;
			return true;	
		}
		throw new RuntimeException("��������");
	}

	@Override
	public E remove() {
		if(!this.isEmpty()) {
			E e =  (E) items[front];
			front = (front+1)%maxSize;
			size--;
			return e;
			
		}
		throw new RuntimeException("������Ϊ��");
	}

	@Override
	public E element() {
		if(!this.isEmpty()) {
			return (E) items[front];
		}
		throw new RuntimeException("������Ϊ��");
		
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
