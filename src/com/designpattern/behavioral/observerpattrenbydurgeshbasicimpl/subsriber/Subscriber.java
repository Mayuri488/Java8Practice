package com.designpattern.behavioral.observerpattrenbydurgeshbasicimpl.subsriber;

import com.designpattern.behavioral.observerpattrenbydurgeshbasicimpl.publisher.Observer;

/**
 * @author Mayuri
 */
public class Subscriber implements Observer {

    @Override
    public void notifyChanges() {
        System.out.println("New Video uploaded : notification");
    }
}
