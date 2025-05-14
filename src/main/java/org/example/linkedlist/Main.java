package org.example.linkedlist;

public class Main {
    Node head = null;

    public static void main(String[] args) {
        Node n1 = new Node("Arjun");
        Node n2 = new Node("Hello");
        Node n3 = new Node("Chetansir");

        Main app = new Main();

        app.insert(n1);
        app.insert(n2);
        app.insert(n3);
        System.out.println("Before ----");
        app.display();
        app.insert(new Node("myjio"), 2);
        System.out.println("After ----");
        app.display();

//        app.search("Hello");
//        app.delete("Chetansir");
//        app.display();
    }

    private void delete(String str) {
        Node current = head;
        if (head.data.equals(str)) {
            head = head.next;
        } else {
            while (!current.next.data.equals(str)) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    private boolean search(String str) {
        Node current = head;
        Node locationRef;
        while (current != null) {
            System.out.println(current.data);
            if (current.data.equals(str)) {
                locationRef = current;
                System.out.println("Available");
                return true;
            }
            current = current.next;
        }
        System.out.println("Not Available");
        return false;
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private void insert(Node ref) {
        if (head == null) {
            head = ref;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ref;
        }
    }

    public void insert(Node ref, int position) {
        if (position == 1) {
            ref.next = head;
            head = ref;
        } else {
            Node current = head;
            int currentPos = 1;
            while (currentPos < position - 1) {
                current = current.next;
                currentPos++;
            }

            ref.next = current.next;
            current.next = ref;
        }
    }
}