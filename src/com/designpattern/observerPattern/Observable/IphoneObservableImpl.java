package com.designpattern.observerPattern.Observable;

import com.designpattern.observerPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mayuri
 */
public class IphoneObservableImpl implements StockObservable{
    private int stockCount=0;

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList();

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer: notificationAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newtockCount) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount = stockCount + newtockCount;
    }

    @Override
    public int setStockCount() {
        return stockCount;
    }
}
