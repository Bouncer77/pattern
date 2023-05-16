package ru.pczver.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublisherInterface {

    private List<PublisherActionListener> listeners = new ArrayList<>();
    @Override
    public List<PublisherActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String message) {
        listeners.forEach(a -> a.doAction(message));
    }

    public void createNewMsg(String msg) {
        System.out.println(msg);
        notifySubscribers(msg);
    }
}
