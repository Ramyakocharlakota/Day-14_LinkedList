package com.LinkedList;

public class LinkedListUC7<L> {
	Node<L> head;

	public class Node<L> {
		L data;
		Node<L> next;

		Node(L data) {
			this.data = data;
		}
	}
	public boolean add(L data) {

		Node<L> newNode = new Node<L>(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node<L> temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}
	public void search(L data) {	  
		if (head == null) {
			return;
		}
		int index = 0;
		Node<L> temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return;
			}
			index++;
			temp = temp.next;
		}
		return;
	}

	public void print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		LinkedListUC7<L>.Node<L> temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		while (temp != null) {

			if (temp.next != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next;
		}
	}
	public static void main (String[] args) {
		LinkedListUC7 linkedlist = new LinkedListUC7();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		linkedlist.print();
		linkedlist.search(30);


}
}
