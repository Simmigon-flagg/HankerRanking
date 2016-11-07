package DataStructures;

import java.util.LinkedList;

public class MyLinkedList {

    Node head;
    int count;

//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
    public MyLinkedList(Node newHead) {

        head = newHead;
        count = 0;
    }

    //Method 
    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get same as insert
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    //insert Same as add
    public static Node insert(Node head, int data) {
        // Create a temp to hold the data        
        Node temp = new Node(data);
        // Set a variable to head or front of the list
        Node current = head;
        //Look for an empty slot in the front
        //if the current != null it true that means the first node

        if (current != null) {
            // Move thought the list looking for a empty slot
            while (current.next != null) {
                current = current.next;
            }
            // No you have an empty slot place the temp value
            current.next = temp;
        } else {
            //else The value is the first node in the list
            head = temp;
        }
        //return the head of the list which holds the new data.
        return head;
    }

    public MyLinkedList(Node head, int count) {
        this.head = head;
        this.count = count;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Simmigon");
        System.out.println(linkedlist);
        linkedlist.add("4046967452");
        System.out.println(linkedlist);

//        Node temp = new Node(data);
//        Node current = head;
//
//        if (current != null) {
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = temp;
//        } else {
//            head = temp;
//        }
    }
}
