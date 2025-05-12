package org.example;

public class Main {
    Node head = null;
    public static void main(String[] args) {
        Node n1 = new Node("Arjun");
        Node n2 = new Node("Jiya Pagal");
        Node n3 = new Node("Chetansir");

        Main app = new Main();
        app.insert(n1);
        app.insert(n2);
        app.insert(n3);

        app.display();
    }

    private void display() {
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    private void insert(Node ref) {
        if(head==null){
            head = ref;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = ref;
        }
    }
}