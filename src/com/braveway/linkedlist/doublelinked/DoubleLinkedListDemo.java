package com.braveway.linkedlist.doublelinked;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		Node hero1 = new Node(1, "宋江", "及时雨");
		Node hero2 = new Node(2, "卢俊义", "玉麒麟");
		Node hero3 = new Node(3, "吴用", "智多星");
		Node hero4 = new Node(4, "林冲", "豹子头");
		
		DoubleLinkedList sll = new DoubleLinkedList();
		System.out.println("===========新增==========");
		sll.add(hero1);
		sll.add(hero2);
		sll.add(hero3);
		sll.add(hero4);
		sll.list();
		
		System.out.println("===========修改==========");
		Node hero5 = new Node(3, "吴用", "智多星1");
		sll.update(hero5);
		sll.list();
		
		System.out.println("===========删除==========");
		sll.remove(2);
		sll.list();
		System.out.println("===========删除==========");
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
			throw new RuntimeException("未找到需要修改的数据");
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
			throw new RuntimeException("未找到需要修改的数据");
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
