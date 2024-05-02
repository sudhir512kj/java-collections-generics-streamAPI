package com.sudhirmeena.genericsandcollections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {
    // Unmodifiable Collections

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums = Collections.unmodifiableList(nums);

        modify(nums);

        System.out.println(nums);
    }

    public static void modify(List<Integer> list) {
        list.remove(0);
    }
}
