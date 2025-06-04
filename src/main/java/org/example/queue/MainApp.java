package org.example.queue;

import org.example.stack.Stack;

public class MainApp {
    Queue object = Queue.getObject();

    public static void main(String[] args) {
        MainApp app = new MainApp();
        Node n1 = new Node("Arjun");
        Node n2 = new Node("Dhanashri");
        Node n3 = new Node("Jiya");
        app.add(n1);
        app.add(n2);
        app.display();
        System.out.println("top " + app.read().data);
        app.add(n3);
        System.out.println("top " + app.read().data);
        app.read();
        System.out.println("top " + app.read().data);
        app.display();

    }

    private void display() {
        object.display();
    }

//    private Node getTop() {
//        return object.top();
//    }

    private Node read() {
        return object.top();
    }

    private void add(Node n1) {
        object.push(n1);
    }
}
