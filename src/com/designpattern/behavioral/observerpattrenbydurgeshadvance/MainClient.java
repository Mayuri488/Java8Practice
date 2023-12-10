package com.designpattern.behavioral.observerpattrenbydurgeshadvance;

import com.designpattern.behavioral.observerpattrenbydurgeshadvance.publisher.YouTubeChannel;
import com.designpattern.behavioral.observerpattrenbydurgeshadvance.subsriber.Subscriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mayuri
 */
public class MainClient {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();
        List<Subscriber> subscribers = getSubscribers();//you can get all Subscribers From DB
        for (Subscriber subscriber:subscribers) {
            channel.subscribe(subscriber);
        }

        channel.notifyWhenUploadVideoOnYoutube();
    }

    private static List<Subscriber> getSubscribers() {
        List<Subscriber>  subscribers = new ArrayList<>();
        Subscriber subscriber1 = new Subscriber("Aarti");
        Subscriber subscriber2 = new Subscriber("Disha");
        Subscriber subscriber3 = new Subscriber("Sandhya");
        Subscriber subscriber4 = new Subscriber("Shweta");
        Subscriber subscriber5 = new Subscriber("Pragati");

        subscribers.addAll(Arrays.asList(subscriber1,subscriber2,subscriber3,subscriber4,subscriber5));
        return subscribers;
    }
}
