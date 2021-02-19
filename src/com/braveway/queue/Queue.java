package com.braveway.queue;

public interface Queue<E> {

	/**
	 * 增加一个元素，如果队列已满，则抛出异常
	 * 
	 * @param e
	 * @return
	 */
	boolean add(E e);

	/**
	 * 移除并返回队列头部的元素,如果队列为空，则抛出异常
	 * 
	 * @return
	 */
	E remove();

	/**
	 * 返回队列的头部元素，如果队列为空，则抛出异常
	 * 
	 * @return
	 */
	E element();

	void show();
	
	boolean isEmpty();
	
	boolean isFull();
}
