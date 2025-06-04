package org.example.queue;

import org.example.stack.Stack;

public class MainApp {
//    Queue object = Queue.getObject();

    public static void main(String[] args) {
        MainApp app = new MainApp();
        Node n1=new Node("Arjun Patel");
        Node n2=new Node("Virat Kohli");

        app.add(n1);
        app.add(n2);

        Node returnedValue=app.retrieve();
        System.out.println(returnedValue.data);
    }

    public void add(Node ref)
    {
        Queue object=Queue.getObject();
        object.insert(ref);
    }

    public Node retrieve()
    {
        Queue object=Queue.getObject();
        return object.read();
    }
}
