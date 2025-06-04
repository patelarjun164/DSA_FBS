package org.example.queue;

public class Queue {
    private static Queue single=new Queue();

    private final Node[] queue=new Node[10];
    private int head=0;
    private int tail=0;

    private final int sizeOfQueue=queue.length;

    private Queue() {
        // TODO Auto-generated constructor stub
    }

    public static Queue getObject()
    {
        return single;
    }

    public void insert(Node ref)
    {
        queue[tail]=ref;
        tail++;
        if(tail==sizeOfQueue)
        {
            System.out.println("Queue is full");
        }
    }

    public Node read()
    {
        Node ref=queue[head];
//		queue[head]=null;
        head++;
        if(head==tail)
        {
            System.out.println("Queue is empty");
        }
        if(head==sizeOfQueue)
        {
            head=0;
            tail=0;
        }
        return ref;
    }
}
