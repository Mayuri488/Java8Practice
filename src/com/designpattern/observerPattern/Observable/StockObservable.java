package com.designpattern.observerPattern.Observable;

import com.designpattern.observerPattern.Observer.NotificationAlertObserver;

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
