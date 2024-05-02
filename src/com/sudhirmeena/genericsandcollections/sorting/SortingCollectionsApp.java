package com.sudhirmeena.genericsandcollections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollectionsApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Bob");
        list.add("Carl");
        list.add("Doug");

        Collections.sort(list);

        System.out.println(list);
    }
}
