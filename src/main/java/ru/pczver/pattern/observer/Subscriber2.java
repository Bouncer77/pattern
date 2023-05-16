package ru.pczver.pattern.observer;

public class Subscriber2 implements PublisherActionListener {
    @Override
    public void doAction(String msg) {
        System.out.println(msg + " from " + this.getClass().getName());
    }
}
