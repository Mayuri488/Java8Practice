package com.designpattern.observerpattrenbydurgeshadvance.subsriber;

import com.designpattern.observerpattrenbydurgeshadvance.publisher.Observer;

/**
 * @author Mayuri
 */
public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notifyChanges() {
        System.out.println("New Video uploaded : notification sent to " +name);
    }
}
