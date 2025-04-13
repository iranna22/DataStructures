
package com.iranna.stack;
// Class representing a node in the linked list
class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

// Class to implement MyStack using a singly linked list
class MyStack {
    Node head; // Head of the linked list

    // Constructor to initialize the MyStack
    MyStack() {
        this.head = null;
    }

    // Function to check if the MyStack is empty
    boolean isEmpty() {
        return head == null;
    }

    // Function to push an element onto the MyStack
    void push(int new_data) {
        // Create a new node with given data
        Node new_node = new Node(new_data);
        new_node.next = head; // Link new node to current top
        head = new_node; // Update top
    }

    // Function to remove the top element from the MyStack
    void pop() {
        if (isEmpty()) {
            System.out.println("\nMyStack Underflow");
            return;
        }
        head = head.next; // Update the top to the next node
    }

    // Function to return the top element of the MyStack
    int peek() {
        if (!isEmpty())
            return head.data;
        else {
            System.out.println("\nMyStack is empty");
            return Integer.MIN_VALUE;
        }
    }

    // Function to display MyStack elements
    void display() {
        if (isEmpty()) {
            System.out.println("\nMyStack is empty");
            return;
        }
        Node temp = head;
        System.out.print("MyStack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Driver code
public class StackWithLinkedList {
    public static void main(String[] args) {
        MyStack st = new MyStack();

        // Push elements onto the MyStack
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        // Display MyStack elements
        st.display();

        // Print top element of the MyStack
        System.out.println("Top element is " + st.peek());

        // Removing two elements from the top
        System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        // Display MyStack elements
        st.display();

        // Print top element of the MyStack
        System.out.println("Top element is " + st.peek());
    }
}
