package com.sudhirmeena.genericsandcollections.list;

import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // O(1)
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);

        list.removeLast();

        System.out.println("Size: " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        for (Integer num : list)
            System.out.println(num);
    }
}
