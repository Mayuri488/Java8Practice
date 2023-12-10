package com.designpattern.observerpattrenbydurgeshadvance.publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mayuri
 */
public class YouTubeChannel implements Subject {
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyWhenUploadVideoOnYoutube() {
        for (Observer subscriber : subscribers) {
            subscriber.notifyChanges();
        }
    }
}
