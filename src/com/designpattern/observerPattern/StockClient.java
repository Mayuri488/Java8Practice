package com.designpattern.observerPattern;

import com.designpattern.observerPattern.Observable.IphoneObservableImpl;
import com.designpattern.observerPattern.Observable.StockObservable;
import com.designpattern.observerPattern.Observer.EmailAlertObserver;
import com.designpattern.observerPattern.Observer.MobileAlertNotification;
import com.designpattern.observerPattern.Observer.NotificationAlertObserver;

/**
 * @author Mayuri
 */
public class StockClient {

    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new MobileAlertNotification("xyz",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(100);//As it is the same instance

    }
}
