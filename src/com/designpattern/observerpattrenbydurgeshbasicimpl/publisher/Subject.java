package com.designpattern.observerpattrenbydurgeshbasicimpl.publisher;

/**
 * @author Mayuri
 */
//Consider Subject as YouTube Channel
public interface Subject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyWhenUploadVideoOnYoutube();
}
