package com.braveway.queue;

/**
 * ����������������ֻ��ʹ��һ�ε�����
 * @author Brave Way
 *
 */
public class CircleArrayQueueTest {

	public static void main(String[] args) {
		
	}
	
}

class CircleArrayQueue<E> implements Queue<E>{
	
	int front  = 0; //ָ����еĵ�һ��Ԫ�����ڵ�λ��
	int rear = 0; //ָ��������һ��Ԫ�صĺ�һ��λ��
	int maxSize;
	final Object[] items;
	
	
	

	public CircleArrayQueue(int maxSize) {
		super();
		this.maxSize = maxSize;
		items = new Object[maxSize];
	}


	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isEmpty() {
		return false;
	}

	public boolean isFull() {
		return false;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
