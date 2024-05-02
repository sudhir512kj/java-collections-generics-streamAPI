package com.sudhirmeena.genericsandcollections.sorting;

import java.util.Arrays;

public class SortingArraysApp {
    public static void main(String[] args) {
        // QuickSort - to sort primitive types (int, double, float, char, etc.)
        // MergeSort - to sort reference types (String, Object, etc.)

        int[] nums = {1, 10, 5, 2, -5, 12, 14, 0, 1, 2};
        String[] names = {"Sudhirmeena", "Sudhir", "Sudhira", "Sudhiram"};

        Arrays.sort(nums);
        Arrays.sort(names);

        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();

        for (String name : names)
            System.out.print(name + " ");
    }
}
