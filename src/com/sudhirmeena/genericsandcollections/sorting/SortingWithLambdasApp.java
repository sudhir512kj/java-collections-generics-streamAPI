package com.sudhirmeena.genericsandcollections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambdasApp {
    public static void main(String[] args) {
        // LAMBDA EXPRESSIONS !!!
        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));
        people.add(new Person("Adam", 20));
        people.add(new Person("Kevin", 25));
        people.add(new Person("Meena", 45));

        Collections.sort(people, Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for (Person person : people)
            System.out.println(person.getName() + " - " + person.getAge());
    }
}
