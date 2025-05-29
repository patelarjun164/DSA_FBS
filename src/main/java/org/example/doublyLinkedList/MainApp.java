package org.example.doublyLinkedList;

public class MainApp {
    Node head;
    Node tail;

    public static void main(String[] args) {
        Node n1 = new Node("Ninja Hathodi");
        Node n2 = new Node("Mighty Raju");
        Node n3 = new Node("Jaggu Bandar");
        Node n4 = new Node("Chhota Bheem");;

        MainApp app = new MainApp();
        app.insert(n1);
        app.insert(n2);
        app.insert(n3);
        app.display();
        app.insert(n4, 2);
        app.display();
//        app.delete("Hello");
//        app.display();
//        app.display(false);
//        app.display(true, false, false, true, true);
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
            if (current.next != null) {
                current.next.previous = current;
            } else {
                tail = current;
            }
//            if (current.next != null) {
//                current.previous.next = current.next;
//                current.next.previous = current.previous;
//            } else {
//                current.previous.next = null;
//            }
        }
    }

//    private void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
//    }


    private void display(boolean... flag) {
//        for(boolean f : flag){
//            System.out.print(f + " ");
//        }

        System.out.println();
        if (flag.length == 0 || flag[0] == true) {
            Node current = head;
            System.out.println("Same order");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else if (flag.length == 1 || flag[1] == false) {
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
        if (head == null) {
            head = ref;
            tail = ref;
        } else {
//            Node current=tail;
//            current.next = ref;
//            tail = ref;
//            tail.previous = current;
//            Node current = head;
            Node current = tail;
//            while (current.next != null) {
//                current = current.next;
//            }
            current.next = ref;
            tail = ref;
            tail.previous = current;
        }
    }

    public void insert(Node ref, int pos){
        Node current = head;
        int curPos = 1;
        if(curPos == pos){
            current.previous = ref;
            head = ref;
            ref.next = current;
            return;
        }
        while(curPos < pos-1){
            current = current.next;
            curPos++;
        }
        if(current.next != null){
            ref.next = current.next;
            current.next = ref;
            ref.next.previous = ref;
            ref.previous = current;
        } else {
            current.next = ref;
            tail = ref;
        }
    }
}
