package org.example.doublyLinkedList;

public class MainApp {
    Node head;
    Node tail;

    public static void main(String[] args) {
        Node n1 = new Node("Arjun");
        Node n2 = new Node("Hello");
        Node n3 = new Node("Jiya Pagal");

        MainApp app = new MainApp();
        app.insert(n1);
        app.insert(n2);
        app.insert(n3);
//        app.display();
        app.display(false);
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private void display(boolean flag) {
        if(flag){
            display();
        } else {
            Node current = tail;
            while (current != null) {
                System.out.println(current.data);
                current = current.previous;
            }
        }

    }

    private void insert(Node ref) {
        if(head == null){
            head = ref;
            tail = ref;
        } else {
            Node current=head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ref;
            tail = ref;
            tail.previous = current;
        }
    }
}
