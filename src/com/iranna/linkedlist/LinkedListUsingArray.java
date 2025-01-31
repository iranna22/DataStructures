package com.iranna.linkedlist;

public class LinkedListUsingArray {

    private int[] array; // Array to store the elements of the linked list
    private int size;    // Current size of the linked list
    private int capacity; // Maximum capacity of the array

    // Constructor to initialize the linked list with a default capacity
    public LinkedListUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0; // Initially, the linked list is empty
    }

    // Method to add a new node at the tail of the linked list
    public void addAtTail(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Linked list is full");
        }
        array[size] = value; // Add the new value at the end of the array
        size++; // Increment the size of the linked list
    }

    // Method to add a new node at a specific index
    public void addAtIndex(int index, int value) {
        if (size == capacity) {
            throw new IllegalStateException("Linked list is full");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        // 1,2,3,4,8,5
        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        
        array[index] = value; // Insert the new value at the specified index
        size++; // Increment the size of the linked list
    }

    // Method to delete a node from the tail of the linked list
    public void deleteFromTail() {
        if (size == 0) {
            throw new IllegalStateException("Linked list is empty");
        }
        size--; // Decrement the size of the linked list
    }

    // Method to delete a node from a specific index
    public void deleteFromIndex(int index) {
        if (size == 0) {
            throw new IllegalStateException("Linked list is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        // 1,2,3,4,6,7,8
        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        
        size--; // Decrement the size of the linked list
    }

    // Method to display the elements of the linked list
    public void display() {
        if (size == 0) {
            System.out.println("Linked list is empty");
        } else {
            System.out.print("Linked list: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        LinkedListUsingArray linkedList = new LinkedListUsingArray(10);

        // Add elements at the tail
        linkedList.addAtTail(10);
        linkedList.addAtTail(20);
        linkedList.addAtTail(30);
        linkedList.addAtTail(28);
        linkedList.addAtTail(35);
        linkedList.display();

        // Add element at a specific index
        linkedList.addAtIndex(2, 15);
        linkedList.display();

        // Delete element from the tail
        linkedList.deleteFromTail();
        linkedList.display();

        // Delete element from a specific index
        linkedList.deleteFromIndex(1);
        linkedList.display();
    }
}
