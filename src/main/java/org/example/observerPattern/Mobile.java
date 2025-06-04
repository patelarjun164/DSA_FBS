package org.example.observerPattern;

public class Mobile implements Observer {

    private float temp;
    Observable weatherStation;

    public Mobile() {
        // TODO Auto-generated constructor stub
    }

    public Mobile(Observable v1) {
        weatherStation=v1;
        v1.subscribeObserver(this);
    }

    @Override
    public void update(float temp) {
        this.temp=temp;
        displayCurrentTemp();
    }

    public void displayCurrentTemp()
    {
        System.out.println("The current temp on mobile is: "+temp);
    }

}
