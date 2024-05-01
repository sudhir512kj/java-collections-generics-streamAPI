package com.sudhirmeena.genericsandcollections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Sudhir");
        set.add("Meena");
        set.add("Adam");
        set.add("Kevin");
        set.add("Joe");

        for (String name : set)
            System.out.println(name);
    }
}
