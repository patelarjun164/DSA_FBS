package org.example.stack;

public class MainApp {
    Stack object = Stack.getObject();

    public static void main(String[] args) {
        MainApp app = new MainApp();
        Node n1 = new Node("Arjun");
        Node n2 = new Node("Dhanashri");
        Node n3 = new Node("Jiya");
        app.insert(n1);
        app.insert(n2);
        app.display();
        System.out.println("top " + app.getTop().data);
        app.insert(n3);
        System.out.println("top " + app.getTop().data);
        app.retrieve();
        System.out.println("top " + app.getTop().data);
        app.display();

    }

    private void display() {
        object.display();
    }

    private Node getTop() {
        return object.top();
    }

    private void retrieve() {
        object.pop();
    }

    private void insert(Node n1) {
        object.push(n1);
    }
}
