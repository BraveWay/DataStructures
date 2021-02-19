package com.braveway.queue;

public interface Queue<E> {

	/**
	 * ����һ��Ԫ�أ�����������������׳��쳣
	 * 
	 * @param e
	 * @return
	 */
	boolean add(E e);

	/**
	 * �Ƴ������ض���ͷ����Ԫ��,�������Ϊ�գ����׳��쳣
	 * 
	 * @return
	 */
	E remove();

	/**
	 * ���ض��е�ͷ��Ԫ�أ��������Ϊ�գ����׳��쳣
	 * 
	 * @return
	 */
	E element();

	void show();
	
	boolean isEmpty();
	
	boolean isFull();
}
