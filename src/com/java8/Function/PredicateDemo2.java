package com.java8.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo2 {
    public static void main(String[] args) {
        // example 4
        Predicate< String > lengthIs3 = x -> x.length() == 3;
        Predicate < String > startWithA = x -> x.startsWith("A");

        List< String > list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List < String > collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
