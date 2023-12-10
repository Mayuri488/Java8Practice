package com.java8.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // example 4
        List<String> list = Arrays.asList("Banana", "Mango", "Apple", "Watermelon");
        // lambda
        Map<String, Integer> map = convertListToMap(list, x -> x.length());

        System.out.println(map); // {node=4, c++=3, java=4, javascript=10}
    }

    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }
}

