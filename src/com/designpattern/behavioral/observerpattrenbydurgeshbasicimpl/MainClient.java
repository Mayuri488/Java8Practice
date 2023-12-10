package com.designpattern.behavioral.observerpattrenbydurgeshbasicimpl;

import com.designpattern.behavioral.observerpattrenbydurgeshbasicimpl.publisher.YouTubeChannel;
import com.designpattern.behavioral.observerpattrenbydurgeshbasicimpl.subsriber.Subscriber;

/**
 * @author Mayuri
 */
public class MainClient {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber aman = new Subscriber();
        channel.subscribe(aman);
        channel.notifyWhenUploadVideoOnYoutube();
    }
}
