package org.example.stack;

public class Stack {
    private static Stack single = new Stack();
    private Node[] stack = new Node[10];
    private int position=0;

    public Stack() {
    }

    public static Stack getObject(){
        return single;
    }

    public void push(Node ref){
        stack[position] = ref;
        position++;
    }

    public void pop(){
        stack[position] = null;
        position--;
    }

    public Node top(){
        return stack[position-1];
    }

    public void display() {
        for(int i=0; i< position; i++){
            System.out.println(stack[i].data);
        }
    }
}
