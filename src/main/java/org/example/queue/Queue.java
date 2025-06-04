package org.example.queue;

public class Queue {
    private static Queue single = new Queue();
    private Node[] queue = new Node[10];
    private int position = 0;
    private int head = 0;

    public Queue() {
    }

    public static Queue getObject() {
        return single;
    }

    public void push(Node ref) {
        queue[position] = ref;
        position++;
    }

    public void pop() {
        queue[head] = null;
        head++;
    }

    public Node top() {
        return queue[head];
    }

    public void display() {
        for (int i = 0; i < position; i++) {
            System.out.println(queue[i].data);
        }
    }
}
