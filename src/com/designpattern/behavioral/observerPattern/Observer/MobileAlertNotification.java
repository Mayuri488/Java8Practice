package com.designpattern.behavioral.observerPattern.Observer;

import com.designpattern.behavioral.observerPattern.Observable.StockObservable;

/**
 * @author Mayuri
 */
public class MobileAlertNotification implements NotificationAlertObserver{
    
    String userName;
    StockObservable stockObservable;

    public MobileAlertNotification(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsg(userName,"Product is in Stock");
    }

    private void sendMsg(String userName, String product_is_in_stock) {
        System.out.println("msg sent to "+userName);
    }
}
