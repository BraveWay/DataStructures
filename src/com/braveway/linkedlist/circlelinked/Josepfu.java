package com.braveway.linkedlist.circlelinked;

/**
 * 使用单向环形列表解决约瑟夫问题
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
		
		CircleSingleLinked csl = new CircleSingleLinked();
		csl.add(boy1);
		csl.add(boy2);
		csl.add(boy3);
		csl.add(boy4);
		csl.add(boy5);
		csl.out(2);
		csl.out(2);
		System.out.println(csl);
	}
}

class CircleSingleLinked {
	Boy first;
	
	public void add(Boy boy) {
		Boy temp = first;
		if(first == null) {
			first = boy;
			boy.next = first;
			return;
		}
		while(temp.next != first) {
			temp = temp.next;
		}
		temp.next = boy;
		boy.next = first;
	}
	
	
	public void out(int m) {
		Boy temp = first;
		for(int i=0;i<m-2;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
}


class Boy{
	int no; //编号
	Boy next;
	
	public Boy(int no) {
		super();
		this.no = no;
	}
}
