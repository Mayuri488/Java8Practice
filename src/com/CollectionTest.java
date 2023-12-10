package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Test1");
        list1.add("Test2");
        list1.add("Test3");
        list1.add("Test4");

        list2.add("Test1");
        list2.add("Test2");




        list1.removeAll(list2);
        System.out.println(list1);
    }
}
