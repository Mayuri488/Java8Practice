package com.java8.Function;

import com.java8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
      /*  Predicate<Person> predicate = (person) -> person.getAge() > 30;
        boolean result = predicate.test(new Person("Ramesh", 31));
        System.out.println(result);*/

        Person person1 = new Person("Mayu", 18, true);
        Person person2 = new Person("Sneha", 18, false);
        Person person3 = new Person("Diksha", 18, false);
        Person person4 = new Person("Pradnya", 18, true);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<String> nameList = personList.stream().filter(person -> !person.isEligible()).map(Person::getName).collect(Collectors.toList());
        System.out.println(nameList);
    }
}
