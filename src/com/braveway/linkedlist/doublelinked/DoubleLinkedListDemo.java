package com.braveway.linkedlist.doublelinked;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		Node hero1 = new Node(1, "�ν�", "��ʱ��");
		Node hero2 = new Node(2, "¬����", "������");
		Node hero3 = new Node(3, "����", "�Ƕ���");
		Node hero4 = new Node(4, "�ֳ�", "����ͷ");
		
		DoubleLinkedList sll = new DoubleLinkedList();
		System.out.println("===========����==========");
		sll.add(hero1);
		sll.add(hero2);
		sll.add(hero3);
		sll.add(hero4);
		sll.list();
		
		System.out.println("===========�޸�==========");
		Node hero5 = new Node(3, "����", "�Ƕ���1");
		sll.update(hero5);
		sll.list();
		
		System.out.println("===========ɾ��==========");
		sll.remove(2);
		sll.list();
		System.out.println("===========ɾ��==========");
		sll.listDesc();
	}
}

class DoubleLinkedList {
	Node head = new Node(-1, "");
	Node tail = new Node(-1, "");

	public void add(Node node) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		node.pre = temp;
		tail.pre = node;
	}

	public void update(Node node) {
		Node temp = head;
		boolean hasUpdated = false;
		while (temp != null) {
			if (temp.data == node.data) {
				temp.data = node.data;
				temp.name = node.name;
				temp.nickName = node.nickName;
				hasUpdated = true;
				break;
			}
			temp = temp.next;
		}
		if (!hasUpdated) {
			throw new RuntimeException("δ�ҵ���Ҫ�޸ĵ�����");
		}
	}

	public void remove(int data) {
		Node temp = head;
		boolean hasRemoved = false;
		while (temp != null) {
			if(temp.data == data) {
				temp.pre.next = temp.next;
				temp.next.pre = temp.pre;
				hasRemoved = true;
				break;
			}
			temp = temp.next;
		}
		if (!hasRemoved) {
			throw new RuntimeException("δ�ҵ���Ҫ�޸ĵ�����");
		}
	}
	
	public void list() {
		Node temp  = head;
		while(temp.next != null) {
			temp = temp.next;
			System.out.println(temp.toString());
		}
	}
	
	public void listDesc() {
		Node temp  = tail;
		while(temp.pre != null) {
			temp = temp.pre;
			if(temp.data != -1) {
				System.out.println(temp.toString());	
			}
		}
	}
	
	
}

class Node {
	int data;
	String name;
	String nickName;
	Node next;
	Node pre;

	public Node(int data, String name) {
		super();
		this.data = data;
		this.name = name;
	}
	
	public Node(int data, String name, String nickName) {
		super();
		this.data = data;
		this.name = name;
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", name=" + name + ", nickName=" + nickName + "]";
	}

}
