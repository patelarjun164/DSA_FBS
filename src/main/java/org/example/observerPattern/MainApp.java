package org.example.observerPattern;

public class MainApp {

    public static void main(String[] args) {

        Queue2 w1=new Queue2();

        Mobile m1=new Mobile(w1);
        Mobile m2=new Mobile(w1);
        Mobile m3=new Mobile();

        w1.changeTemp(12);
        w1.changeTemp(23);
    }

}
