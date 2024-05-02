package com.sudhirmeena.genericsandcollections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        // Methods of the Collections class

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);
        nums.add(15);

        // we can reverse the order
        Collections.reverse(nums);

        // min and max finding
        System.out.println("Min: " + Collections.min(nums));
        System.out.println("Max: " + Collections.max(nums));

        // we can shuffle the underlying collection - bogo sort
        // Collections.shuffle(nums);

        Collections.rotate(nums, 2);

        System.out.println(nums);
    }
}
