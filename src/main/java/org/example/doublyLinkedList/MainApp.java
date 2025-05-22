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
        app.display();
//        app.display(false);
//        app.display(true, false, false, true, true);
    }

//    private void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
//    }

    private void display(boolean ...flag) {
//        for(boolean f : flag){
//            System.out.print(f + " ");
//        }

        System.out.println();
        if(flag.length == 0 || flag[0]==true){
            Node current = head;
            System.out.println("Same order");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else if(flag.length==1 || flag[1]==false){
            Node current = tail;
            System.out.println("Reverse order");
            while (current != null) {
                System.out.println(current.data);
                current = current.previous;
            }
        } else {
            System.out.println("Invalid Paramter for display...!!!");
        }

    }

    private void insert(Node ref) {
        if(head == null){
            head = ref;
            tail = ref;
        } else {
//            Node current=tail;
//            current.next = ref;
//            tail = ref;
//            tail.previous = current;
            Node current = head;
//              Node current = tail;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ref;
            tail = ref;
            tail.previous = current;
        }
    }
}
