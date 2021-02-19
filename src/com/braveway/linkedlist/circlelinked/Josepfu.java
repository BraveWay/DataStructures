package com.braveway.linkedlist.circlelinked;

/**
 * ʹ�õ������б���Լɪ������ Josephu 
 * ����Ϊ������Ϊ 1��2���� n �� n ����Χ��һȦ��Լ�����Ϊ k��1<=k<=n�����˴� 1
 * ��ʼ���������� m ���Ǹ��˳��У�������һλ�ִ� 1 ��ʼ������
 * ���� m ���Ǹ����ֳ��У��������ƣ�
 * ֱ�������˳���Ϊֹ���ɴ� ����һ�����ӱ�ŵ����С�
 * 
 * @author Brave Way
 *
 */
public class Josepfu {

	public static void main(String[] args) {
		Boy boy1 = new Boy(1);
		Boy boy2 = new Boy(2);
		Boy boy3 = new Boy(3);
		Boy boy4 = new Boy(4);
		Boy boy5 = new Boy(5);
		Boy boy6 = new Boy(6);
		Boy boy7 = new Boy(7);
		Boy boy8 = new Boy(8);
		Boy boy9 = new Boy(9);
		Boy boy10 = new Boy(10);

		CircleSingleLinked csl = new CircleSingleLinked();
		csl.add(boy1);
		csl.add(boy2);
		csl.add(boy3);
		csl.add(boy4);
		csl.add(boy5);
		csl.add(boy6);
		csl.add(boy7);
		csl.add(boy8);
		csl.add(boy9);
		csl.add(boy10);

		csl.out(5);
	}
}

class CircleSingleLinked {
	Boy first;

	public void add(Boy boy) {
		Boy temp = first;
		if (first == null) {
			first = boy;
			boy.next = first;
			return;
		}
		while (temp.next != first) {
			temp = temp.next;
		}
		temp.next = boy;
		boy.next = first;
	}

	public void out(int m) {
		Boy temp = first;
		while (temp.next != temp) {// ֻҪ���������ڵ��������
			for (int i = 1; i < m - 1; i++) {// �ҵ�Ҫ���ڵ����һ���ڵ�
				temp = temp.next;
			}
			System.out.println(temp.next.no);// temp.next����Ҫ���Ľڵ�
			temp.next = temp.next.next;
			temp = temp.next;// tempָ��Ҫ���ڵ����һ���ڵ�
		}
		System.out.println(temp.no);
	}
}

class Boy {
	int no; // ���
	Boy next;

	public Boy(int no) {
		super();
		this.no = no;
	}
}
