package com.java8;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        AtomicInteger chargeDetailsIndex = new AtomicInteger(0);
        System.out.println(chargeDetailsIndex.get());
    }
}
