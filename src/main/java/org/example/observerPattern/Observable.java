package org.example.observerPattern;

public interface Observable {
    void subscribeObserver(Observer ref);
    void unSubscribeObserver(Observer ref);
    void notifyAllObservers();
}
