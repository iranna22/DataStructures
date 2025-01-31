package com.iranna.stack;


class Stack {
    private int[] arr; // Array to store stack elements
    private int top;   // Points to the top of the stack
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // StackImplementation is initially empty
    }

    // Add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("StackImplementation Overflow! Cannot add element " + element);
            return;
        }
        arr[++top] = element;
        System.out.println("Pushed " + element + " into the stack.");
    }

    // Remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("StackImplementation Underflow! No element to pop.");
            return -1;
        }
        return arr[top--];
    }

    // Get the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("StackImplementation is empty.");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }
}

// Driver code to test the stack
public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        

        System.out.println("Top element is: " + stack.peek());
        System.out.println("StackImplementation size is: " + stack.size());

        stack.pop();
        System.out.println("After popping, top element is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}
