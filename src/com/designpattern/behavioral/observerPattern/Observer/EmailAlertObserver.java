package com.designpattern.behavioral.observerPattern.Observer;

import com.designpattern.behavioral.observerPattern.Observable.StockObservable;

/**
 * @author Mayuri
 */
public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock");
    }

    private void sendEmail(String emailId, String product_is_in_stock) {
        System.out.println("mail sent to "+emailId);
    }


}
