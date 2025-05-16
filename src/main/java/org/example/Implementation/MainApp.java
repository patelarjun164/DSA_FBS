package org.example.Implementation;

public class MainApp {
    Node head = null;
    Node lastNode = null;
    public static void main(String[] args) {
        Account account = new Account(1, "Arjun", 50000);

        Node n1 = new Node(account);
//        Node n2 = new Node(account2);
        MainApp app = new MainApp();

        app.insert(n1);
//        app.insert(n3);
        System.out.println("Before Changes");
        app.display();
        System.out.println("After Changes");
        account = account.setName("Viratsir", app);
        account = account.setBalance(150 , app);
        account = account.setId(2, app);
//        app.insert(n2);
        app.display();
        System.out.println(app.retrieve());
        System.out.println(app.retrieve(0.4));
    }

    private Node retrieve() {
        return lastNode;
    }

    private Node retrieve(double ver) {
        Node current = head;
        while (current != null) {
            if (current.getVersion()==ver) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insert(Node ref) {
        if (head == null) {
            head = ref;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ref;
        }
        lastNode = ref;
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.println("-----");
            System.out.println(current.getRef());
            System.out.println(current.getVersion());
            System.out.println("-----");
            current = current.next;
        }
    }
}
