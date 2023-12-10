package com.designpattern.observerpattrenbydurgeshbasicimpl.subsriber;

import com.designpattern.observerpattrenbydurgeshbasicimpl.publisher.Observer;

/**
 * @author Mayuri
 */
public class Subscriber implements Observer {

    @Override
    public void notifyChanges() {
        System.out.println("New Video uploaded : notification");
    }
}
