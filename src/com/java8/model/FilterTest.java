/*
package com.java8.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterTest {


    public static final Predicate<String> filterNames = charge -> (!charge.equalsIgnoreCase(
            "Piyu") && !charge.equalsIgnoreCase("Shilpa")
            && !charge.equalsIgnoreCase("Smita") );

    public static void main(String[] args) {
        List<Person>  persons = new ArrayList<>();
        Person person1 = new Person("Mayu",33);
        Person person2 = new Person("Pradnya",35);
        Person person3 = new Person("Piyu",33);
        Person person4 = new Person("Smita",34);
        Person person5 = new Person("Snehal",37);
        Person person6 = new Person("Puja",34);
        Person person7 = new Person("Savi",37);
        Person person8 = new Person("Shilpa",37);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);

        System.out.println(persons.stream().filter(person -> filterNames.test(person.getName())).collect(Collectors.toList()));


    }



}
*/
