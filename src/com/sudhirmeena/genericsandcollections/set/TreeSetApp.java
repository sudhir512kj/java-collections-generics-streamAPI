package com.sudhirmeena.genericsandcollections.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        // O(logN)
        // MEMORY FRIENDLY !!!
        SortedSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        Set<Integer> subSet = set.subSet(5, 120);
        System.out.println(set.first());

        for (Integer num : set)
            System.out.println(num);
    }
}
