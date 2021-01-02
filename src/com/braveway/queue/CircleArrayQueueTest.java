package com.braveway.queue;

/**
 * 解决数组队列中数组只能使用一次的问题
 * @author Brave Way
 *
 */
public class CircleArrayQueueTest {

	public static void main(String[] args) {
		
	}
	
}

class CircleArrayQueue<E> implements Queue<E>{
	
	int front  = 0; //指向队列的第一个元素所在的位置
	int rear = 0; //指向队列最后一个元素的后一个位置
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
