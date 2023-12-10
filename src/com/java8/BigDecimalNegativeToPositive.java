package com.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigDecimalNegativeToPositive {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("-14.5165");
        System.out.println("Absolute value is " + num.abs());

        List<String>  empList = new ArrayList<>();

        empList.add("Mayuri");
        empList.add("Pritali");
        empList.add("Pradnya");
        empList.add("Manisha");
        System.out.println("Before"+empList);
        Collections.reverse(empList);
        System.out.println("After"+empList);

    }
}
