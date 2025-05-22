package org.example.doublyLinkedList;

public class Node {
    String data;
    Node next;
    Node previous;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
