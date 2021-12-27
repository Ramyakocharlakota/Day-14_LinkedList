package com.LinkedList;

public class LinkedListUC6<L> {
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
	public boolean popLast() {

		if (head == null)
			return false;
		if (head.next == null) {
			head = null;
			return true;
		}

		Node<L> temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;

		return false;
	}
	public void print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		Node<L> temp = head;
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
	public static void main(String[] args) {
		LinkedListUC6 linkedlist = new LinkedListUC6();
		linkedlist.add(56);
		linkedlist.print();
		linkedlist.add(30);
		linkedlist.print();
		linkedlist.add(70);
		linkedlist.print();
		linkedlist.popLast();
		linkedlist.print();
	}


}
