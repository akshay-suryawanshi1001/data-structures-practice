package com.akshay.ds.singlylinkedlist;

import java.util.List;

import org.omg.CORBA.Current;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		  SinglyLinkedList sll = new SinglyLinkedList();
		  sll.head = new ListNode(10);
		  ListNode second = new ListNode(12);
		  ListNode third = new ListNode(54);
		  ListNode fourth = new ListNode(33);
		  //now link them sequentially
		  sll.head.next = second;  //10 --> 12
		  second.next = third;	//10 --> 12 --> 54
		  third.next  = fourth; //10 --> 12 --> 54 -->null<<
		  
		  sll.printLinkedList();
		  sll.getSize();
		  
		  //insert to first
		  sll.insertFirst(11);
		  System.out.println("new linked list is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  //insert to last
		  sll.insertLast(99);
		  System.out.println("\nnew linked list is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  sll.insertAtPosition(3,22);
		  System.out.println("\nnew linked list is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  sll.insertAtLast(44);
		  System.out.println("\nnew linked list is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  sll.deleteFirst();
		  System.out.println("\nnew linked list is after deleting firstnode is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  sll.deleteLast();
		  System.out.println("\nnew linked list is after deleting last node is as belows");//// print newly created list
		  sll.printLinkedList();
		  
		  ListNode deletedNode = sll.deleteAtPosition(4);
		  System.out.println("\n deleted node had data :"  + deletedNode.data);//// print newly created list
		  sll.printLinkedList();
		  
		  System.out.println("\n is 33 present: " + sll.isPresent(33));
	}
	
	private void printLinkedList() {
		//print the data in the linked list
		  ListNode currentNode = head;
		  while(currentNode != null) {
			  System.out.print(currentNode.data +" --> ");
			  currentNode = currentNode.next;
		  }
		  System.out.print("null");
	}

	private int getSize() {
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println("\nsize of singlyLinkedList is: " + count);
		return count;
	}
	
	private void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	private void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			head = newNode;
			return;
		}
		//traverse thorugh list to go to last one
		ListNode currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	private void insertAtPosition(int position, int data) {   //insertAtPosition(3,22)
		ListNode newNode = new ListNode(data);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
		}else {
			int count = 1;
			ListNode previous = head;  // use this to traverse
			while(count < position - 1 ) {  //condition to use to traverse to needed position
				previous = previous.next;
				count++;
			}
			ListNode positionPlusOne = previous.next;  // put the nextNode in temp variable
			newNode.next = positionPlusOne;
			previous.next = newNode;
		}
		
	}
	
	private void insertAtLast(int data) {
		SinglyLinkedList sll = this;
		int size = sll.getSize(); 
		sll.insertAtPosition(size + 1, data);
	}
	
	private ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp =  head;
		head = head.next;   //point head to the consecutive next node
		temp.next = null;
		return temp;   //return deelted node 
	}
	
	public ListNode deleteLast() {
		if(head ==null || head.next ==null) {
			return null;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next !=null) {
			previous = current;		
			current = current.next; // int the end previous will have last node
		}
		previous.next = null;
		return current;
	}
	
	public ListNode deleteAtPosition(int position) {
		if(position == 1) {
			head = head.next;
			return head;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < position -1 ) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			return current;
		}
	
	}
	
	//search an element in linked list
	public boolean isPresent(int searchData) {
		ListNode current = head;
		while(current.next != null) {
			if(current.data == searchData) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
