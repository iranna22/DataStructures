package com.iranna.linkedlist;

    
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeLinkedList {
    // Method to delete a node at a given position
    static Node deleteNode(Node head, int position) {
        if (head == null) {
            System.out.println("The list is empty.");
            return head;
        }

        // If head needs to be removed
        if (position == 0) {
            return head.next; // Return the new head
        }

        // Find the previous node of the node to be deleted
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                System.out.println("Position "+position+"  out of bounds.");
                return head;
            }
            current = current.next;
        }

        // If the node to be deleted is beyond the last node
        if (current.next == null) {
            System.out.println("Position "+position+" of bounds.");
            return head;
        }

        // Unlink the node from the linked list
        current.next = current.next.next;
        return head;
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Creating a sample list: 10 -> 20 -> 30 -> 40 -> null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original list:");
        printList(head);

        int a = 3, b = 0, c = 5;

        // Deleting a node at position 2
        head = deleteNode(head, a);
        System.out.println("After deleting node at position: " + a);
        printList(head);

        // Deleting the head node (position 0)
        head = deleteNode(head, b);
        System.out.println("After deleting node at position: " + b);
        printList(head);

        // Trying to delete a node at an invalid position
        head = deleteNode(head, c);
        printList(head);

    }
}

