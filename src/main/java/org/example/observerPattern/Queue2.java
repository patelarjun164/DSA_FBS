package org.example.observerPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 implements Observable{

//    List<Observer> observers=new ArrayList();
    private final Observer[] observers = new Observer[10];
    private int head=0;
    private int tail=0;

    private final int size=observers.length;
//    Queue<Observer> observers = new LinkedList<>();
    private float temp;
    public Queue2() {
    }

    @Override
    public void subscribeObserver(Observer ref) {
        observers[tail]=ref;
        tail++;
        if(tail==size)
        {
            System.out.println("Queue is full");
        }
        //observers.add(ref);
    }

    @Override
    public void unSubscribeObserver(Observer ref) {
        int indexOfRef = getIndex(ref);
        //we don't remove object from inbetween in queue
        if(indexOfRef==head){
            head++;
        } else System.out.println("only remove ops done from head");

        if(head==tail)
        {
            System.out.println("Queue is empty");
        }
        if(head==size)
        {
            head=0;
            tail=0;
        }
//        if(observers.contains(ref))
//        {
////            int index=observers.indexOf(ref);
//            observers.remove(ref);
//        }
//        else
//        {
//            System.out.println("Suggested Observer does not exist");
//        }

    }

    private int getIndex(Observer ref) {
        for (int i = 0; i < size; i++) {
            if(observers[i].equals(ref)) return i;
        }
        System.out.println("ref not found");
        return -1;
    }

    @Override
    public void notifyAllObservers() {
//        for(Observer ref:observers)
//        {
//            ref.update(temp);
//        }
        for(int i=head; i< tail; i++){
            observers[i].update(temp);
        }
    }

    public void tempChanged()
    {
        notifyAllObservers();
    }

    public void changeTemp(float temp)
    {
        this.temp=temp; //State changed
        tempChanged();
    }
}
