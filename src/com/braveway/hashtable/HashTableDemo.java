package com.braveway.hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(1,"ncvb");
		Emp e2 = new Emp(2,"nbcv");
		Emp e3 = new Emp(3,"mvbn");
		Emp e4 = new Emp(4,"fasd");
		Emp e5 = new Emp(5,"yret");
		Emp e6 = new Emp(11,"fads");
		Emp e7 = new Emp(12,"gsdf");
		Emp e8 = new Emp(22,"zbc");
		Emp e9 = new Emp(32,"1fads");
		
		HashTable  hashTable = new HashTable();
		hashTable.put(e1);
		hashTable.put(e2);
		hashTable.put(e3);
		hashTable.put(e4);
		hashTable.put(e5);
		hashTable.put(e6);
		hashTable.put(e7);
		hashTable.put(e8);
		hashTable.put(e9);
	}
}

class HashTable{
	EmpLinkedList[] table = null;
	
	
	public HashTable() {
		table = new  EmpLinkedList[10];
	}
	
	public void put(Emp e) {
		int index  = hashCode(e.getId()); 
		EmpLinkedList linked = table[index];
		if(linked == null) {
			linked = new EmpLinkedList();
		}
		linked.add(e);
		table[index] = linked;
	}
	
	private int hashCode(int v) {
		return v % 10;
	}

}

class EmpLinkedList{
	
	Emp head ;
	
	public void add(Emp e) {
		if(head == null) {
			head = new Emp();
			head.next = e;
		}else {
			Emp temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = e;
		}
	}
}

class Emp{
	private int id;
	private String name;
	Emp next;
	
	public Emp() {
		super();
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}