package com.LinkedList;

public class LinkedListUC2<L> {
	Node head;
	L data ;
	public boolean add(L i) {

		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		newNode.next1 = temp;
		head = newNode;

		return true;
	}
	
	public L print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return data;
		}

		LinkedListUC2<L>.Node temp = head;
		if (head.next1 == null) {
			System.out.println(head.data);
			return data;
		}
		while (temp != null) {

			if (temp.next1 != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next1;
		}
		return data;
	}
	
	public class Node {
		public LinkedListUC2<L>.Node next1;
		LinkedListUC2<L>.Node next ;
		private L data;

		Node(L data){
			this.data = data;
		}
		
		public L print() {

			if (head == null) {
				System.out.println("No elements to show...");
				return data;
			}

			LinkedListUC2<L>.Node temp = head;
			if (head.next1 == null) {
				System.out.println(head.data);
				return data;
			}
			while (temp != null) {

				if (temp.next != null)
					System.out.print(temp.data + " ===> ");
				else
					System.out.println(temp.data);

				temp = temp.next;
			}
			return data;
		}
		public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list.add(56);
			list.add(30);
			list.add(70);
			list.print();
		}
	}

}
