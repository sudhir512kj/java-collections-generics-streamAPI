package com.sudhirmeena.genericsandcollections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        // works like a balanced BST
        // Map<Integer, String> map = new TreeMap<>();
        // O(1) < O(logN)
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(10, "ten");
        map.put(3, "three");
        map.put(5, "five");
        map.put(1, "one");
        map.put(8, "eight");

        System.out.println("Smallest key: " + map.lastKey());
        System.out.println("Largest key: " + map.firstKey());

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
