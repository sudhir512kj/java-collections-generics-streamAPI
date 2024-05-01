package com.sudhirmeena.genericsandcollections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        // initial capacity = 16
        // hashCode function (hash-function) transforms the input into an array index
        // O(1) + memory heavy
        // there may be collisions - O(logN)
        Set<String> set1 = new HashSet<>();

        set1.add("Adam");
        set1.add("Mary");
        set1.add("Joe");
        set1.add("Katy");

        for (String name : set1)
            System.out.println(name);

        Set<String> set2 = new HashSet<>();
        set2.add("Adam");
        set2.add("Ana");

        System.out.println(set1.containsAll(set2));

        set1.remove("Ana");
    }
}
