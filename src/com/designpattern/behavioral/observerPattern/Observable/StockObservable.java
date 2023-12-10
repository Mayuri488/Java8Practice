package com.designpattern.behavioral.observerPattern.Observable;

import com.designpattern.behavioral.observerPattern.Observer.NotificationAlertObserver;

/**
 * @author Mayuri
 */
public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newtockCount);
    public int setStockCount();
}
