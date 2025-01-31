package com.iranna.linkedlist;



//Implementation of a Singly Linked List in Java
public class CustomLinkedList {
 // Node class represents each element in the linked list
 static class Node {
     int data; // Data stored in the node
     Node next; // Reference to the next node

     // Constructor for creating a new node
     Node(int data) {
         this.data = data;
         this.next = null;
     }
 }

 private Node head; // Reference to the head (first node) of the list
 private Node tail; // Reference to the tail (last node) of the list
 private int size; // Size of the linked list

 // Constructor for initializing an empty linked list
 public CustomLinkedList() {
     head = null;
     tail = null;
     size = 0;
 }

 // Method to add a new node at the tail of the linked list
 public void addAtTail(int data) {
     Node newNode = new Node(data); // Create a new node
     if (head == null) {
         // If the list is empty, head and tail both point to the new node
         head = tail = newNode;
     } else {
         // Link the new node to the current tail and update the tail reference
         tail.next = newNode;
         tail = newNode;
     }
     size++; // Increment the size of the list
 }

 // Method to add a new node at a specific index
 public void addAtIndex(int index, int data) {
     if (index < 0 || index > size) {
         throw new IndexOutOfBoundsException("Invalid index");
     }
     Node newNode = new Node(data); // Create a new node
     if (index == 0) {
         // Insert at the head
         newNode.next = head;
         head = newNode;
         if (tail == null) { // If the list was empty, update the tail
             tail = head;
         }
     } else {
    	 // 12 -> 13 -> 15 -> 17 -> 11 -> 19 -> 16 -> null
         // Traverse to the node just before the target index
         Node current = head;
         for (int i = 0; i < index - 1; i++) {
             current = current.next;
         }
         // Link the new node in the chain
         newNode.next = current.next;
         current.next = newNode;
         if (newNode.next == null) { // If inserted at the tail, update the tail reference
             tail = newNode;
         }
     }
     size++; // Increment the size of the list
 }

 // Method to delete a node from the tail
 public void deleteFromTail() {
     if (head == null) {
         throw new IllegalStateException("List is empty");
     }
     if (head == tail) {
         // If there's only one node, reset the head and tail
         head = tail = null;
     } else {
         // Traverse to the second-last node
         Node current = head;
         while (current.next != tail) {
             current = current.next;
         }
         // Unlink the last node and update the tail reference
         current.next = null;
         tail = current;
     }
     size--; // Decrement the size of the list
 }

 // Method to delete a node at a specific index
 public void deleteAtIndex(int index) {
     if (index < 0 || index >= size) {
         throw new IndexOutOfBoundsException("Invalid index");
     }
     if (index == 0) {
         // Remove the head node
         head = head.next;
         if (head == null) { // If the list becomes empty, update the tail
             tail = null;
         }
     } else {
         // Traverse to the node just before the target index
         Node current = head;
         for (int i = 0; i < index - 1; i++) {
             current = current.next;
         }
         // Unlink the target node
         current.next = current.next.next;
         if (current.next == null) { // If removed the tail, update the tail reference
             tail = current;
         }
     }
     size--; // Decrement the size of the list
 }

 // Method to display the elements of the linked list
 public void display() {
     Node current = head; // Start from the head
     while (current != null) {
         System.out.print(current.data + " -> "); // Print each node's data
         current = current.next; // Move to the next node
     }
     System.out.println("null"); // End of the list
 }

 // Main method for testing the implementation
 public static void main(String[] args) {
	 CustomLinkedList list = new CustomLinkedList();

     // Add elements to the list
     list.addAtTail(10);
     list.addAtTail(20);
     list.addAtTail(30);
     System.out.println("After adding at tail:");
     list.display();

     // Add element at specific index
     list.addAtIndex(1, 15); // Add 15 at index 1
     System.out.println("After adding 15 at index 1:");
     list.display();

     // Delete the tail node
     list.deleteFromTail();
     System.out.println("After deleting from tail:");
     list.display();

     // Delete node at specific index
     list.deleteAtIndex(1); // Delete node at index 1
     System.out.println("After deleting node at index 1:");
     list.display();
 }
}
