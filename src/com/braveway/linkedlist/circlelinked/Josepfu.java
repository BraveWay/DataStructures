package com.braveway.linkedlist.circlelinked;

/**
 * 使用单向环形列表解决约瑟夫问题 Josephu 
 * 问题为：设编号为 1，2，… n 的 n 个人围坐一圈，约定编号为 k（1<=k<=n）的人从 1
 * 开始报数，数到 m 的那个人出列，它的下一位又从 1 开始报数，
 * 数到 m 的那个人又出列，依次类推，
 * 直到所有人出列为止，由此 产生一个出队编号的序列。
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
		while (temp.next != temp) {// 只要还有两个节点就往下找
			for (int i = 1; i < m - 1; i++) {// 找到要出节点的上一个节点
				temp = temp.next;
			}
			System.out.println(temp.next.no);// temp.next就是要出的节点
			temp.next = temp.next.next;
			temp = temp.next;// temp指向要出节点的下一个节点
		}
		System.out.println(temp.no);
	}
}

class Boy {
	int no; // 编号
	Boy next;

	public Boy(int no) {
		super();
		this.no = no;
	}
}
