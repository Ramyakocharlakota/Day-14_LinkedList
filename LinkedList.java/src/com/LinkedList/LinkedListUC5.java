package com.LinkedList;

public class LinkedListUC5 {
	class Node {
	    int data;
	    Node next;
	};

	class LinkedList {
	  Node head;

	  LinkedList(){
	    head = null;
	  }

	  //Add new element at the end of the list
	  void push_back(int newElement) {
	    Node newNode = new Node();
	    newNode.data = newElement;
	    newNode.next = null; 
	    if(head == null) {
	      head = newNode;
	    } else {
	      Node temp = new Node();
	      temp = head;
	      while(temp.next != null)
	        temp = temp.next;
	      temp.next = newNode;
	    }    
	  }

	  //Delete first node of the list
	  void pop_front() {
	    if(this.head != null) {
	      this.head = this.head.next;  
	    }
	  }

	  //display the content of the list
	  void PrintList() {
	    Node temp = new Node();
	    temp = this.head;
	    if(temp != null) {
	      System.out.print("The list contains: ");
	      while(temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	      }
	      System.out.println();
	    } else {
	      System.out.println("The list is empty.");
	    }
	  }    
	};

	// test the code
	public class Implementation { 
	  public static void main(String[] args) {
	    LinkedListUC5 MyList = new LinkedListUC5();

	    //Add four elements in the list.
	    MyList.push_back(56);
	    MyList.push_back(30);
	    MyList.push_back(70);
	    MyList.PrintList(); 

	    //Delete the first node
	    MyList.pop_front();
	    MyList.PrintList();  
	  }
	}

	public void push_back(int i) {
		// TODO Auto-generated method stub
		
	}

	public void pop_front() {
		// TODO Auto-generated method stub
		
	}

	public void PrintList() {
		// TODO Auto-generated method stub
		
	}

}
