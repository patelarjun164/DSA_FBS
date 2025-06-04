package org.example.observerPattern;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 implements Observable{

//    List<Observer> observers=new ArrayList();
    Queue<Observer> observers = new LinkedList<>();
    private float temp;

    public Queue2() {

    }

    @Override
    public void subscribeObserver(Observer ref) {
        observers.add(ref);
    }

    @Override
    public void unSubscribeObserver(Observer ref) {
        if(observers.contains(ref))
        {
//            int index=observers.indexOf(ref);
            observers.remove(ref);
        }
        else
        {
            System.out.println("Suggested Observer does not exist");
        }
    }

    @Override
    public void notifyAllObservers() {
        for(Observer ref:observers)
        {
            ref.update(temp);
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
