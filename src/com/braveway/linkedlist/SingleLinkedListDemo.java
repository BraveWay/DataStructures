package com.braveway.linkedlist;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		Node hero1 = new Node(1, "宋江", "及时雨");
		Node hero2 = new Node(2, "卢俊义", "玉麒麟");
		Node hero3 = new Node(3, "吴用", "智多星");
		Node hero4 = new Node(4, "林冲", "豹子头");
		
		SingleLinkedList sll = new SingleLinkedList();
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
	}
}

class SingleLinkedList{
	Node head = new Node(-1);
	
	public void add(Node node) {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void update(Node node) {
		Node temp = head;
		boolean hasUpdated = false;
		while(temp.next != null) {
			if(temp.next.data == node.data) {
				temp.next.name = node.name;
				temp.next.nickName = node.nickName;
				hasUpdated = true;
				break;
			}
			temp = temp.next;
		}
		if(!hasUpdated) {
			throw new RuntimeException("未找到需要修改的值");
		}
	}
	
	public void remove(int data) {
		Node temp = head;
		boolean hasRemoved = false;
		while(temp.next != null) {
			if(temp.next.data == data) {
				temp.next = temp.next.next;
				hasRemoved = true;
				break;
			}
			temp = temp.next;
		}
		if(!hasRemoved) {
			throw new RuntimeException("未找到需要删除的结点");
		}
	}
	
	public void list() {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.next.toString());
			temp = temp.next;
		}
	}
}

class Node{
	int data;
	String name;
	String nickName;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
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
